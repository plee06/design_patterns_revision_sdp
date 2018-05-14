package iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private Shape [] shapes;
    int pos;


    public ShapeIterator(Shape []shapes){
        this.shapes = shapes;
    }

    // implements hasNext
    @Override
    public boolean hasNext() {
        if(pos >= shapes.length || shapes[pos] == null)
            return false;
        return true;
    }

    // implements next() on our shape object
    @Override
    public Shape next() {
        return shapes[pos++];
    }

    // implements remove operation
    @Override
    public void remove() {
        if(pos <=0 )
            throw new IllegalStateException("Illegal position");
        if(shapes[pos-1] !=null){
            for (int i= pos-1; i<(shapes.length-1);i++){
                shapes[i] = shapes[i+1];
                shapes[shapes.length-1] = null;
            }
        }
    }
}
