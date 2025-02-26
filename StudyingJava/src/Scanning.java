import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scanner.nextLine();

        System.out.print("Enter your money in the bank account: ");
        double money = scanner.nextDouble();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Are you a student(true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name + ".");
        System.out.println("You have " + money + "＄ in bank accout.");
        System.out.println("You are "+ age + "years old.");
        System.out.println("Student: " + isStudent );


        scanner.close();


    }
}
