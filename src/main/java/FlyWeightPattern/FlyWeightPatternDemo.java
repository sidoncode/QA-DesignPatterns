package FlyWeightPattern;

public class FlyWeightPatternDemo {
    private static final String color [] = { "RED" , "GREEN","BLUE" , "YELLOW","ORANGE" , "BLACK","WHITE"};

    public static void main(String [] aergs){


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
