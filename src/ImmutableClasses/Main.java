package ImmutableClasses;

import java.util.List;

import static ImmutableClasses.BankAccount.AccountType.CHECKING;

public class Main {
    public static void main(String[] args) {
//        BankAccount account= new BankAccount(BankAccount.AccountType.CHECKING,500);
//        System.out.println(account);
        BankCustomer alex = new BankCustomer("Alex",800.00,1000.00);
        System.out.println(alex);

        List<BankAccount> accounts = alex.getAccounts();
        accounts.clear();
        System.out.println(alex);
    }
}
