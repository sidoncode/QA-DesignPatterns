package DecoratorPattern;

public class DecoratorPatternDemo {

    public static void main(String [] args){

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Circle With Normal Border");
        circle.draw();

        // do the same thing for red circle and for Red Rectangle Also. //
        redCircle.draw();

    }


}
