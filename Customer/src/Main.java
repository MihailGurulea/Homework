public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Mihail", 5);
        Invoice invoice = new Invoice(11, customer, 200);

        System.out.println("The amount after the discount: " + invoice.getAmountAfterDiscount());
    }

}
