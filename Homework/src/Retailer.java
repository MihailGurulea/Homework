import java.util.Scanner;

public class Retailer {
    public static void RetailerSales(){
        double product1;
        double product2;
        double product3;
        double product4;
        double product5;
        int i = 1;
        double value = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Input the amount of products that were sold: ");

        product1 = s.nextDouble();
        product2 = s.nextDouble();
        product3 = s.nextDouble();
        product4 = s.nextDouble();
        product5 = s.nextDouble();

        for(;i<=5;i++){
            switch (i){
                case 1: value = product1 * 2.98; break;
                case 2: value = value + product2 * 4.50; break;
                case 3: value = value + product3 * 9.98; break;
                case 4: value = value + product4 * 4.49; break;
                case 5: value = value + product5 * 6.87; break;
            }
        }
        System.out.printf("The total value of the products sold is: $%.2f",value);
    }
}
