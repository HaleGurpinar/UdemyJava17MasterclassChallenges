package OOP2_Polymorphism.Composition;

public class SmartKitchen {

private  CoffeeMaker brewMaster;
private DishWasher dishWasher;
private Refrigerator iceBox;

public SmartKitchen(){
    brewMaster=new CoffeeMaker();
    dishWasher=new DishWasher();
    iceBox=new Refrigerator();
}

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,boolean dishwasherFlag ){
    brewMaster.setHasWorktoDo(coffeeFlag);
    iceBox.setHasWorktoDo(fridgeFlag);
    dishWasher.setHasWorktoDo(dishwasherFlag);
    }
    public void doKitchenWork(){
    brewMaster.brewCoffee();;
    iceBox.orderFood();
    dishWasher.doDishes();
    }
    public void addWater(){
    brewMaster.setHasWorktoDo(true);
    }
    public void pourMilk(){
    iceBox.setHasWorktoDo(true);
    }
    public void loadDishWater(){
    dishWasher.setHasWorktoDo(true);
    }
}

class CoffeeMaker{
    private boolean hasWorktoDo;
    public boolean getHasWorkToDo () {
        return hasWorktoDo;
    }
    public void setHasWorktoDo(boolean hasWorktoDo){
        this.hasWorktoDo=hasWorktoDo;
    }
    public void brewCoffee(){
        if (hasWorktoDo) {
            System.out.println("CoffeeMaker is brewing coffee");
        }else{
            System.out.println("The Coffee Maker is off");
        }
    }


}

class DishWasher{
    private boolean hasWorktoDo;
    public boolean getHasWorkToDo () {
        return hasWorktoDo;
    }
    public void setHasWorktoDo(boolean hasWorktoDo){
        this.hasWorktoDo=hasWorktoDo;
    }
    public void doDishes(){
        if (hasWorktoDo) {
            System.out.println("DishWasher is washing dishes");
        }else {
            System.out.println("The DishWasher is off");
        }
    }
}

class Refrigerator {
    private boolean hasWorktoDo;

    public boolean getHasWorkToDo() {
        return hasWorktoDo;
    }

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }

    public void orderFood() {
        if (hasWorktoDo) {
            System.out.println("Refrigerator is ordering food");
        } else {
            System.out.println("The Refrigerator is off");
        }
    }
}

