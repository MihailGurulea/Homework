public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer.toString() + "balance=$" + getBalance();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        Account account = new Account(1, customer);
        setBalance(getBalance()+amount);
        return account;
    }

    public Account withdraw(double amount){
        Account account = new Account(1, customer);
        if(account.getBalance() >= amount){
            account.setBalance(account.getBalance() - amount);
        } else System.out.println("Amount withdrawn exceeds the current balance!");
        return account;
    }
}
