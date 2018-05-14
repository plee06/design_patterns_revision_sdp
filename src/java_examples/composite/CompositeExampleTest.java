package composite;

/**
 * Composite Design Pattern Runner to test this Example ...
 *
 *
 * */
public class CompositeExampleTest {

    /**
     * The whole idea of the Composite Design Pattern is to tackle patterns that need to use a
     * part-whole hierarchy, i.e. we want to treat objects within an object uniformly like this HTML Tree
     * structure where each Leaf / Composite within the Component is used when the Client speaks with our
     * Component through the Composites / Leaves.
     *
     * Technically though our Client speaks with the Component it just doesn't know about it.
     *
     * Client -> Asks Component to Create Parent Tag (Composite)
     * Client -> Asks Component to Create Element Tags (Leaves)
     *
     * Client -> Runs entire program using both Composites and Leaves (Two Objects) which are treated in a
     * "uniform" manner from some Root (Component)
     *
     * By using our service, the Client can treat one object, and all it's children on generation as if each
     * were an object on it's own.
     *
     * So this composite pattern should be used when we want to represent part-whole hierarchies and when
     * we want clients to ignore the difference between compositions (i.e. specific methods that add / remove
     * leaves with operations) and simpler leaves (that only run operations our elements here)
     * */
    public static void main(String[] args) {
        HtmlTagComponent parentTag = new HtmlParentElementComposite("<HTML>");
        parentTag.setStartTag("<HTML>");
        parentTag.setEndTag("</HTML>");

        HtmlTagComponent parentTag2 = new HtmlParentElementComposite("<body>");
        parentTag2.setStartTag("<body>");
        parentTag2.setEndTag("</body>");

        HtmlTagComponent childTag1 = new HtmlElementLeaf("<p>");
        childTag1.setStartTag("<p>");
        childTag1.setTagBody("Hello World!");
        childTag1.setEndTag("</p>");

        HtmlTagComponent childTag2 = new HtmlElementLeaf("<p>");
        childTag2.setStartTag("<p>");
        childTag2.setTagBody("Hello Again World!");
        childTag2.setEndTag("</p>");


        parentTag.addChildTag(parentTag2);
        parentTag2.addChildTag(childTag1);
        parentTag2.addChildTag(childTag2);

        parentTag.generateHtml();

    }


}
