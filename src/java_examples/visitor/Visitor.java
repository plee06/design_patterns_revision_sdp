package visitor;

/**
 * interface for our visitor objects
 *
 *
 * */
public interface Visitor {

    // defines two visit methods, one that takes in an HtmlElement and the other a ParentElement
    public void visit(HtmlElement element);
    public void visit(HtmlParentElement parentElement);
}
