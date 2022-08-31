package DecoratorPattern;

public abstract class ShapeDecorator implements Shape{
    // creating a variable of Shape - type - Interface // and it is protected
    protected Shape decoratedShape;

    // this is  the public contructor - name of the constructor and the class shud be same //
    // parameterized

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
     decoratedShape.draw();
    }

}
