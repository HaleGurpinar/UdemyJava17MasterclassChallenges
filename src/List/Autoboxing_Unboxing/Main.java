package List.Autoboxing_Unboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}


public class Main {

    public static void main(String[] args) {

        Customer bob= new Customer("Bob S",1000.0);
        System.out.println(bob);
        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A",500.0);
        System.out.println(bank);
    }
}

class Bank{
    private String name;
    private ArrayList<Customer> customers= new ArrayList<>(5000);

    public Bank(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n",customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if (getCustomer(customerName)==null){
            Customer customer= new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: "+ customer);
        }
    }
    public  void addTransaction(String name, double transactionAmount){

    }
}
