package visitor;

/**
 * the interface that all our concrete elements implement so that it can accept an Visitor object
 *
 *
 * */
public interface Element {

    public void accept(Visitor visitor);
}
