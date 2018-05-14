package composite;

import java.util.List;

/**
 * Our representation of the Component super abstract class (can either be abstract class or interface)
 * that contains all the important methods used in a composite class or leaf class.
 *
 *
 * This Composite Design Pattern is used to represent the HtmlTag Example!
 *
 * Composite Design Pattern can be used anywhere there is a hierarchical nature and individual objects within
 * can be treated in a uniform manner, i.e. think Tree and Subtrees, Trees are recursive in nature!
 *
 *
 * */
public abstract class HtmlTagComponent {

    /*
    * Component Classes will have the following methods:
    *
    * operation()
    * add(Component)
    * remove(Component)
    * getChildren()
    *
    * */

    /*
    * As you can see the reasoning behind an abstract class, some of these methods are implemented in teh same
    * fashion in both subclasses (leaves and elements) but some are not and are unique which are left abstract!
    *
    * Consider how a leaf doesn't need getChildren() which throws an Exception and is overridden in an element
    * but left alone in a leaf
    *
    * */


    // Get current tag name
    public abstract String getTagName();

    // Set the start tag
    public abstract void setStartTag(String tag);

    // Set the end tag
    public abstract void setEndTag(String tag);

    // Set the tag body
    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Currently not supported");
    }

    // Add a child tag to this current tag component
    public void addChildTag(HtmlTagComponent htmlTagComponent) {
        throw new UnsupportedOperationException("Currently not supported");
    }

    // Remove a child tag from this tag component
    public void removeChildTag(HtmlTagComponent htmlTagComponent) {
        throw new UnsupportedOperationException("Currently not supported");
    }

    // Get the children of this tag component
    public List<HtmlTagComponent> getChildren() {
        throw new UnsupportedOperationException("Currently not supported");
    }

    // Generate the Html for this component
    public abstract void generateHtml();
}
