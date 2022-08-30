package FactoryPattern;

public class ShapeFactory {

    // create a method for getting the - ShapeType

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(); // object of class Circle
            // Circle obj = new Circle();
        }

        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();  // object of class RECTANGLE
        }

        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(); // object of class SQUARE
        }

        // in singleton - we create one object and get the instance of that object.
        // but in ShapeFactory the number of object creation it is depending on the usecase.
        // in singleton we get the restriction - that create only one object.

        return null;
    }

}
