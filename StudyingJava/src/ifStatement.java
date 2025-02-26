import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();//scanner da buraya bunu yazarak sorunu çözüyoruz

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Are you  student(true/false): ");
        isStudent =scanner.nextBoolean();

        if (name.isEmpty()){
            System.out.println("you didn't enter your name ");
        }
        else{
            System.out.println("hello " + name );
        }


        if ( age >=65){
            System.out.println("You are asenior");
        }
        else if(age >=18){
            System.out.println("You are an adult");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else if (age<0){
            System.out.println("you haven't born yet");
        }
        else {
            System.out.println("You are a child");
        }

        if (isStudent == true){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not student");
        }


        {

        }

    }
}
