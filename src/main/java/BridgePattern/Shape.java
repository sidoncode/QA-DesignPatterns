package BridgePattern;

public abstract class Shape {
    // declaring a proctected variable with the Type DrawApi;
    protected DrawAPI drawAPI;

    // Creating a Proctected Constructor //
    // Constructor -> parametirzed //

    // Volkswagen virtus

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
