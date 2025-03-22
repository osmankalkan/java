import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of week: ");
        String day = scanner.nextLine();


/*
        switch (day){
            case "monday" -> System.out.println("it is a weekday ");
            case "tuesday" -> System.out.println("it is a weekday ");
            case "thursday" -> System.out.println("it is a weekday ");
            case "wednesday" -> System.out.println("it is  a weekday ");
            case "friday" -> System.out.println("it is a weekday ");
            case "saturday" -> System.out.println("it is the weekend ");
            case "sunday" -> System.out.println("it is the weekend ");
            default -> System.out.println("is not a day");

 */


            switch (day){
                case "monday", "tuesday"," wednesday" ,"thursday", "friday"-> System.out.println("it is a weekday");
                case "saturday","sunday" -> System.out.println("it is the weekend");

                default -> System.out.println(day +"is not a day");
        }

        scanner.close();
    }
}
