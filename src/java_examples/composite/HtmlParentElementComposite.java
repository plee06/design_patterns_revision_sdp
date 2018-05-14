package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Example Composite Class
 *
 * */
public class HtmlParentElementComposite extends HtmlTagComponent {

    /*
    * Necessary Instance Variables for our Composite Class
    *
    * */
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTagComponent> childrenTag;


    // Our Constructor to construct the Parent Element
    public HtmlParentElementComposite(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(HtmlTagComponent htmlTag) {
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTagComponent htmlTag) {
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTagComponent> getChildren() {
        return this.childrenTag;
    }

    /**
     * Iterate through all children within this parent and print out their tags accordingly
     *
     * */
    @Override
    public void generateHtml() {

        System.out.println(this.startTag);

        for (HtmlTagComponent tag : childrenTag) {
            tag.generateHtml();
        }

        System.out.println(this.endTag);
    }
}
