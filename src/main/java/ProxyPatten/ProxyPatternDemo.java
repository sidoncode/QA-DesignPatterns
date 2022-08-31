package ProxyPatten;

public class ProxyPatternDemo {

    public static void main(String [] args){
        Image image = new ProxyImage("xyz.png");
        //load from disk

        image.display();
        //display image

        image.display();
        // display the filename

        Image image1 =new RealImage("XYZ1");

        //load from disk
        image1.display();
        //display image
        image1.display();
        // display the filename
    }
}
