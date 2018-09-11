class Billing {

    static void computeBilling(int price){
        System.out.println("The PhotoBook will cost: $" + price);
    }

    static void computeBilling(int price, int quantity){
        System.out.println("The PhotoBook will cost: $" + price * quantity);
    }

    static void computeBilling(int price, int quantity, int couponValue){
        System.out.println("The PhotoBook will cost: $" + (price * quantity - couponValue));
    }
}
