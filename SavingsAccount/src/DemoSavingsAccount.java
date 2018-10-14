public class DemoSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Your savings account balance is: $" + saver1.getSavingsBalance());
        System.out.println("Your savings account balance is: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Your savings account balance is: $" + saver1.getSavingsBalance());
        System.out.println("Your savings account balance is: $" + saver2.getSavingsBalance());
    }
}
