package PrototypePattern;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type; // this variable is in the - public constuctor of extended (Sub class) //
    abstract void draw();
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getType() {
        return type;
    }
    // remove SetType //
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }
        return clone;
    }
}
