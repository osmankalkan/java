public class Printf {
    public static void main(String[] args) {


        /*
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n" , name);
        System.out.printf("Your name start with a %c\n" , firstletter);
        System.out.printf("You are %d years old\n" , age);
        System.out.printf("You are %f inches tall\n" , height);
        System.out.printf("Employed; %b\n" , isEmployed);
        System.out.printf("%s is %d years old", name , age);




        double price1 = 9.99;
        double price2 = 1000000.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n", price3);
        System.out.printf("%.2f\n", price1);


        // + = output a plus
        System.out.printf("%+.1f\n", price1);
        // , = comma grouping separator
        System.out.printf("%,.1f\n", price2);
        // ( = negative numbers are enclosed in ()
        System.out.printf("%(.2f\n", price3);
        // space = display a minus if negative,space is positive
        System.out.printf("% .1f\n", price1);
        System.out.printf("% .1f\n", price3);

         */

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);
    }
}
