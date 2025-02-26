import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number ;

        number = random.nextInt(1,7);

        System.out.println(number);

        boolean isHead;

        isHead = random.nextBoolean();
        System.out.println(isHead);


        double x ;

        x = random.nextDouble();
        System.out.println(x);

        if (isHead){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAİLS");
        }




    }
}
