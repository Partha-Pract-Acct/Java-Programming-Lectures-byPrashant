/*
Define a BankAccount class with private attributes like accountNumber, accountHolderName, and balance.
Provide public methods to deposit and withdraw money, ensuring that these methods don't allow illegal operations
like withdrawing more money than the current balance
 */

package in.coding.challenge75;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Partha");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
