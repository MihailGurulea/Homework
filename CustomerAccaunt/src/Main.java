public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(20288, "Mihail", 'M');
        Account account = new Account(11, customer, 1000);

        account.deposit(2000);
        System.out.println(account.withdraw(1.0));

    }

}
