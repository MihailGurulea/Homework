import java.util.Scanner;

public class MyCharacter {
    private int strength;
    private int agility;
    private int intelligence;
    private String race;

    Scanner s = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);

    public MyCharacter(){
        this.strength = 0;
        this.agility = 0;
        this.intelligence = 0;
        this.race = "Human";
    }

    public static void displayCharacter(MyCharacter character){
        System.out.println("Character's stats are: ");
        System.out.println("Strength: " + character.getStrength());
        System.out.println("Agility: " + character.getAgility());
        System.out.println("Intelligence: " + character.getIntelligence());
        System.out.println("Your characters race is: " + character.getRace() + "\n");
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        System.out.println("Input the characters Strength(int): ");
        this.strength = s.nextInt();
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility() {
        System.out.println("Input the characters Agility(int): ");
        this.agility = s.nextInt();
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence() {
        System.out.println("Input the characters Intelligence(int): ");
        this.intelligence = s.nextInt();
    }

    public String getRace() {
        return race;
    }

    public void setRace() {
        System.out.println("Which Race(String) would your character be: ");
        this.race = s2.nextLine();
    }
}
