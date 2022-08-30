package PrototypePattern;
import java.util.Hashtable;
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();}
    public static void loadCache(){
        // creating the object of circle class
        Circle circle = new Circle();
        // init the object with the key value as 1
        circle.setId("1");
        // putting the key <> value pairs at the Hashmap
        // so that we can keep the track of how many object we have created
        shapeMap.put(circle.getId(),circle);
        // creating the object of square class
        Square square = new Square();
        // init the object with the key value as 2
        square.setId("2");
        shapeMap.put(square.getId(),square);
        // creating the object of rectangle class
        Rectangle rectangle = new Rectangle();
        // init the object with the key value as 3
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
