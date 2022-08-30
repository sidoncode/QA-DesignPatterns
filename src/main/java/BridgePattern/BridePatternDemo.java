package BridgePattern;

public class BridePatternDemo {
    public static void main(String [] args){

        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(200,100,20,new GreenCircle());

        redCircle.draw();
        // draw() -> drawapi (interface) -> drawcircle(); //

        // draw () -> drawapi (intreface);
        // draw() -> drawcircle();

        greenCircle.draw();

    }
}
