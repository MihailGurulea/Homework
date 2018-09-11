

public class TwoCharacters {
    public static void main(String[] args) {
        MyCharacter firstCharacter = new MyCharacter();
        MyCharacter secondCharacter = new MyCharacter();
        MyCharacter defaultCharacter = new MyCharacter();

        firstCharacter.setStrength();
        firstCharacter.setAgility();
        firstCharacter.setIntelligence();
        firstCharacter.setRace();

        secondCharacter.setStrength();
        secondCharacter.setAgility();
        secondCharacter.setIntelligence();
        secondCharacter.setRace();

        MyCharacter.displayCharacter(firstCharacter);
        MyCharacter.displayCharacter(secondCharacter);
        MyCharacter.displayCharacter(defaultCharacter);
    }
}
