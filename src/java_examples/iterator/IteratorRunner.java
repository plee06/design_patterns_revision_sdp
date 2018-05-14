package iterator;

/**
 *
 * Runner for our iterator design pattern
 *
 * */
public class IteratorRunner  {

    public static void main(String[] args) {
        // first we create the storage of our shapes
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");

        // then we define our iterator passing in our colelction of shapes
        ShapeIterator iterator = new ShapeIterator(storage.getShapes());

        // we then iterate over al lthese shapes which is possible because we implemented the iteartor
        // interface
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // and then removes
        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(storage.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
    /***
     * an aggregate object is just an object instance with other objects.
     *
     * In this example our aggregate object is the ShapeStorage which holds all our shapes .
     *
     * we want to access these aggregate objects in a manner that "iterates" over all of them so we can do things!
     * but we can't do that without the iterator design pattern and so we have to create a ShapeIterator
     * class which implements iterator and works with our aggregate object instance (ShapeStorage),
     * the shapeIterator gets passed in our storage collection which then allows us to work with
     * these object instances as if they were primitive types!
     *
     *
     */

}
