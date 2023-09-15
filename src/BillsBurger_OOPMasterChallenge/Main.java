package BillsBurger_OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {
//    Item coke= new Item("drink","coke",1.50);
//    coke.printItem();
//    coke.setSize("LARGE");
//    coke.printItem();
//
//    Item mushroom= new Item("Topping","mushroom",7.0);
//    mushroom.setSize("SMALL");
//    mushroom.printItem();
//-------------------------------------------------------------------------------------------------
//        Burger burger= new Burger("regular ",10.0);
//        burger.printItem();
//        burger.addToppings("MUSHROOM","SALAMI","CHEESE");
//        burger.printItem();
//-------------------------------------------------------------------------------------------------//        MealOrder regularMeal1 = new MealOrder();
//        regularMeal1.printItemizedList();


//        MealOrder regularMeal= new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();


//        MealOrder secondMeal= new MealOrder("turkey ","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal= new MealOrder("deluxe","7-up","chili");
       // deluxeMeal.addBurgerToppings("MUSHROOM","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.addBurgerToppings("MUSHROOM","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
