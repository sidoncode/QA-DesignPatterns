package SingletonPattern;

public class SingleObject {

    // creating a instance //
    private static SingleObject instance = new SingleObject();
    // single object -> instance //

    // creating a private constructor//

    private SingleObject(){
        // empty constructor
    }

    public static SingleObject getInstance(){
        System.out.println("This is the method for instance Creation Check");
        return instance;
    }

    // creating a public method //
    public void showMessage(){
        System.out.println("This is the Method present in SingleObject");
    }


}
