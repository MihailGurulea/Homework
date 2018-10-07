public class VarArgs {
    private static int product(int... numbers){
        int returnValue = 1;
        for(int i : numbers){
            returnValue *= i;
        }
        return returnValue;
    }
    public static void main(String[] args) {
        System.out.println(product(3, 5, 6));
    }
}
