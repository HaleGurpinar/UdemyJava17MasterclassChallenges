package ImmutableClasses;

import static ImmutableClasses.BankAccount.AccountType.CHECKING;

public class Main {
    public static void main(String[] args) {
        BankAccount account= new BankAccount(BankAccount.AccountType.CHECKING,500);
        System.out.println(account);
    }
}
