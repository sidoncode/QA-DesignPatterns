package BridgePattern;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("The radius: " + radius + " The Coordinates are (x.y)" + x +" , " + y);
    }
}
