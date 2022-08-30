import java.util.ArrayList;
import java.util.List;

public class Meal {

    // this call is the Customer - Ordering the Item Class //
    // Customer will add the item / meal in the Basket -> get the cost and atlast we will print - the bill //

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
     float cost = 0.0f;

        for(Item item: items){
            cost = cost + item.price();
        }
        return cost;
    }

    public void printItems(){
        for(Item item : items){
            System.out.println("Item:  " + item.name());
            System.out.println("Packing:  " + item.packing().pack());
            System.out.println("Price:  " + item.price());
        }
    }
}
