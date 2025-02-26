import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String item;
        double price;
        int quantities;
        char qurrency = '﹩';
        double total;

        System.out.print("What item would you like: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each item:");
        price = scanner.nextDouble();
        System.out.print("How many would you like it: ");
        quantities = scanner.nextInt();


        total = price * quantities;

        System.out.println("You have bought " + quantities + " " + item );
        System.out.println("Your total bought is " + total + qurrency);








        scanner.close();

    }
}
