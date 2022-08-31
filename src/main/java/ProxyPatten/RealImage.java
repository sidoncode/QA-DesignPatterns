package ProxyPatten;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadfromDisk(fileName);
    }

    private void loadfromDisk(String fileName) {
        System.out.println("Loading: " + fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }


}
