package FlyWeightPattern;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap circleMap = new HashMap();


    private static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating the Circle of Color :" + color);
        }

        return circle;
    }
}