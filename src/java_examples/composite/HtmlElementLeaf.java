package composite;

/**
 * Example Leaf class of our HtmlTagComponent
 *
 * The main job of the leaf class is to implement the operation method which in this example is the generateHtml method
 *
 * But to do that it needs to support it with a tagName, startTag, endTag and tagBody. Think about how every HTML
 * element has those corresponding features
 * */
public class HtmlElementLeaf extends HtmlTagComponent {
    /*
    * Instance Variables
    *
    * */

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    // Constructor
    public HtmlElementLeaf(String tagName) {
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }

    @Override
    public String getTagName() {
        return this.tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void setTagBody(String tag) {
        this.tagBody = tag;
    }

    @Override
    public void generateHtml() {
        System.out.println(this.startTag + "" + this.tagBody + "" + this.endTag);
    }
}
