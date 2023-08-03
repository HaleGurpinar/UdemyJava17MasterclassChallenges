package OOP2_Polymorphism.Composition;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen=new SmartKitchen();

//        kitchen.getBrewMaster().setHasWorktoDo(true);
//        kitchen.getBrewMaster().brewCoffee();
//
//        kitchen.getDishWasher().setHasWorktoDo(true);
//        kitchen.getDishWasher().doDishes();
//
//        kitchen.getIceBox().setHasWorktoDo(true);
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(false,false,true);
        //kitchen.setKitchenState(true ,true,true);
        kitchen.doKitchenWork();

    }
}
