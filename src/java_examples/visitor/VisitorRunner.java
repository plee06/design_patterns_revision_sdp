package visitor;

/**
 *
 * running of our visitor pattern
 *
 * */
public class VisitorRunner {

    public static void main(String[] args) {

        // before the "visiting"
        System.out.println("Before visitor......... \\n");
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);
        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
        parentTag.generateHtml();


        // after the visit
        System.out.println("\\nAfter visitor....... \\n");
        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();
        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(style);
        parentTag.accept(cssClass);
        p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        p1.accept(style);
        p1.accept(cssClass);
        parentTag.addChildTag(p1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        child1.accept(style);
        child1.accept(cssClass);
        p1.addChildTag(child1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        child1.accept(style);
        child1.accept(cssClass);
        p1.addChildTag(child1);
        parentTag.generateHtml();
    }

    /**
     * So what's happening?
     *
     * Essentially whats happening is that for each Element object that we have we implement an accept method
     * which takes in a specific "Visitor" object which defines an interface which has two methods which
     * makes changes to a specific element (it takes in an element object as its argument) and it does something
     * to the original element. Here we add "stylings" to the HTML tags.
     *
     * The advantage of this visitor pattern is that we can now make changes to these elements
     * without changing the actual element code, each element just needs to implement "accept(Visitor visitor..)"
     * and the visitor object will take care of the rest with its implementation of the changes.
     *
     *
     * */
}
