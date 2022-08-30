public abstract class Burger implements Item{

    // There is sub-type of the item burger//
    // so for that - let the burger class be abstract and then - veg / non veg be the classes

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
