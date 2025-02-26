import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        //System.out.println(Math.PI);


        /*
        double result;

        result = Math.pow(7,3);//üslü alma


        result = Math.abs(-9);//mutlak değer alma

        result = Math.sqrt(737);//kök alma

        result = Math.round(3.9);//yuvarlama

        result = Math.ceil(3.14);//yukarı yuvarlama

        result = Math.floor(3.14); // asagı yuvarlama

        System.out.println(result);

         */



        /*
        //HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the lenght of side A : ");
        a = scanner.nextDouble();
        System.out.print("Enter the lenght of side B : ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is : " + c + "cm" ) ;



        scanner.close();

         */


        Scanner scanner = new Scanner(System.in);

        double radius;

        System.out.print("Enter the radius: ");
        radius=scanner.nextDouble();
        double circumference;
        double area;
        double volume;

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

        System.out.println("The circumference is: " + circumference + " cm" );
        System.out.println("The area is : " + area +" cm²");
        System.out.println("The volume is : " + volume + " cm³");













        scanner.close();


















    }
}
