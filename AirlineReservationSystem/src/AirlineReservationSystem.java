import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {


    }
    private static void firstClassSeatAssignment(boolean[] firstClassArray){
        Scanner s = new Scanner(System.in);
        SeatAssignment seat = new SeatAssignment();
        if(firstClassArray[4]){
            System.out.println("The first class is full, would you like to book a economy seat? (Y/N)");
            String input = s.nextLine();
            if (input.equals("Y")){
                AirlineReservationSystem.economyClassSeatAssignment(seat.getEconomyClass());
            }
        } else {
            for(int i = 0; i < 5; i++){
                if(!seat.getFirstClass()[i]){
                    seat.setFirstClass();
                }
            }
        }
    }
    private static void economyClassSeatAssignment(boolean[] economyClassArray){
        Scanner s = new Scanner(System.in);
        if(economyClassArray[4]){
            System.out.println("The economy class is full, would you like to book a first class seat? (Y/N)");
            String input = s.nextLine();
        }
    }
}
