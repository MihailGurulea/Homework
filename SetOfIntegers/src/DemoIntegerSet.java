public class DemoIntegerSet {
    public static void main(String[] args) {
        IntegerSet first = new IntegerSet();
        IntegerSet second = new IntegerSet();

        first.insertElement(1);
        first.insertElement(2);
        first.insertElement(3);
        first.insertElement(4);
        first.insertElement(5);
        System.out.println("First IntegerSet: " + first.toString());

        second.insertElement(4);
        second.insertElement(5);
        second.insertElement(6);
        second.insertElement(7);
        second.insertElement(8);
        System.out.println("Second IntegerSet: " + second.toString());

        System.out.println("The union: " + IntegerSet.union(first, second).toString());

        System.out.println("The intersection: " + IntegerSet.intersection(first, second).toString());

        System.out.println("The difference: " + IntegerSet.difference(first,second).toString());

    }
}
