package FlyWeightPattern;

public class FlyWeightPatternDemo {
    private static final String color [] = { "RED" , "GREEN","BLUE" , "YELLOW","ORANGE" , "BLACK","WHITE"};

    public static void main(String [] aergs){
        Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
        circle.setX(getRandomX());
        circle.setY(getRandomY());
        circle.setRadius(100);
        circle.draw();

    }

    private static String getRandomColor(){
        return color[(int) (Math.random() * color.length)];
    }

    private static int getRandomX(){
        return (int) (Math.random() * 100);
    }

    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }

}
