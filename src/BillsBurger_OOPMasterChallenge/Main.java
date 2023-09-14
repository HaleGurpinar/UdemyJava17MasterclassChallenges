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

        Burger burger= new Burger("regular ",10.0);
        burger.printItem();
        burger.addToppings("MUSHROOM","SALAMI","CHEESE");
        burger.printItem();
    }
}
