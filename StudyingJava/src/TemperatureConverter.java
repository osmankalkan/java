import java.util.Locale;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp= scanner.nextDouble();

        System.out.print("convert the Celsius or Fahrenheit ?: ");
        unit= scanner.next().toUpperCase();

        System.out.println(temp);
        System.out.println(unit);

        // (condition) ? true : false

        newtemp =(unit.equals("c")) ? (temp-32) * 5 / 9 : (temp * 5 / 9) +32;
        System.out.println(newtemp);





        scanner.close();


    }
}
