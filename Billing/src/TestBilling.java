public class TestBilling {
    public static void main(String[] args) {
        //System.out.println("Input the price of the PhotoBook: ");
        Billing.computeBilling(100);
        //System.out.println("Input the price of the PhotoBook: ");
        //System.out.println("Input the quantity of the PhotoBooks");
        Billing.computeBilling(100,3);
        //System.out.println("Input the price of the PhotoBook: ");
        //System.out.println("Input the quantity of the PhotoBooks: ");
        //System.out.println("Input the discount coupon value: ");
        Billing.computeBilling(100,3,50);
    }
}

