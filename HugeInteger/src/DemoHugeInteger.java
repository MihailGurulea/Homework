public class DemoHugeInteger {
    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger("9999");
        System.out.println(hugeInteger.toString());

        System.out.println("Add result is: " + hugeInteger.toString1(hugeInteger.add("9999")));

    }
}
