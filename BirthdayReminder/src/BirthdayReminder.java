import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        String sentinel = "";
        String sentinel2 = "";
        Scanner s = new Scanner(System.in);
        String [] theArray = new String[10];
        int counter = 0;

        while(!sentinel.equals("ZZZ")){
            System.out.println("Input the name and age: ");
            sentinel = s.nextLine();
            if(sentinel.equals("ZZZ")) continue;
            theArray[counter] = sentinel;
            counter++;
        }

        System.out.println("You've inputted " + counter + " names!");

        for (int i = 0; i < counter; i++){
            System.out.println(theArray[i]);
        }

        while(!sentinel2.equals("ZZZ")){
            System.out.println("Input name: ");
            sentinel2 = s.nextLine();
            if(sentinel2.equals("ZZZ")) break;
            int counter2 = 0;
            for(String str : theArray) {
                if (!sentinel2.matches(str)) {
                    System.out.println(str.substring(str.length() - 6));
                    counter2++;
                }
            }
            if(counter2 == 0){
                System.out.println("There is no such name: " + sentinel2);
            }
        }



    }
}
