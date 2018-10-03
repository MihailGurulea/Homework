package IonExercises;

public class ConstructID {
    public static void construct(String name, String address) {
        String finalString = "";
        char[] charAddress = address.toCharArray();

        String[] s = name.split(" ");
        String nameInitials = "";
        String tempDigit = "";

        for (int i = 0; i < s.length; i++){
            nameInitials += s[i].charAt(0);
        }

        nameInitials = nameInitials.toUpperCase();

        for (int i = 0; i < charAddress.length; i++){
            if(Character.isDigit(charAddress[i])){
                tempDigit += charAddress[i];
            }
        }

        System.out.println("Your ID is: " + nameInitials.concat(tempDigit));
    }
}
