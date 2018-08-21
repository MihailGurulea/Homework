public class Factorial {
    public static void FactorialNumbers(){
        long i = 1L;
        long product = 1L;
        long counter = 1L;
        for (;i<=20;i++){
            product = counter;
            product = product * i;
            counter = product;
            System.out.println(counter);
        }
    }
}
