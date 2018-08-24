public class WhilePolindrome {
    public static void Polindrome(){
        int number = 1234321;
        int reverseNumber = 0;

     while(number > 0){
         reverseNumber = (reverseNumber * 10) + number % 10;
         number /= 10;
     }
        System.out.println(reverseNumber);
    }
}
