public class DemoHugeInteger {
    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger("9999");
        HugeInteger hugeInteger2 = new HugeInteger("8999");
        System.out.println(hugeInteger.toString());

        System.out.println(hugeInteger.isEqualTo(hugeInteger2));

        System.out.println("Add result is: " + hugeInteger.toString1(hugeInteger.add("9999")));

    }
}
