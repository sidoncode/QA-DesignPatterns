public class BuilderPatternDemo {

    public static void main(String [] args){

        // create a VegMeal -> vegBurger + Coke
        // ShowtheItems -> VegBurger + Coke
        // ShowtheTotalCost -> Costof(VegBurger ->25.7 ) + Costof(Coke -> 3.0) = totalcost = 28.7

            MealBuilder mealBuilder = new MealBuilder();
            Meal vegMeal = mealBuilder.prepareVegMeal(); // this line is - easy idential - that in the java - is Builderpattern is used or not
            vegMeal.printItems();

        // create a NonVegMeal -> NonvegBurger + Pepsi
        // ShowtheItems -> NonVegBurger + Pepsi
        // ShowtheTotalCost -> Costof(NonVegBurger ->30.0 ) + Costof(Pepsi -> 2.0) = totalcost = 32.7

            Meal NonvegMeal = mealBuilder.prepareNonVegMeal();
            NonvegMeal.printItems();
    }
}
