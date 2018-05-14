package prototype;

/**
 * Our interface of Prototype which extends the Cloneable class so we can use the "clone()" method in Java
 * for all our ConcretePrototypes that we want cloned and returned to the client
 *
 *
 *
 * */
public interface Prototype extends Cloneable {

    public AccessControl clone() throws CloneNotSupportedException;
}
