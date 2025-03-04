public class StringMethods {
    public static void main(String[] args) {

        String name = "Password";

        /*


         String name = "Osman";
         int lenght = name.length();
         char letter = name.charAt(2);
         int index = name.indexOf(" ");
         int lastIndex = name.lastIndexOf("n");


         //name = name.toUpperCase();
         //name = name.toLowerCase();
         System.out.println(name);





        String name = "Osman";

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);




        if(name.contains(" ")){
            System.out.println("Your name is contain space");
        }
        else{
            System.out.println("your name DOESN'T contain any spaces");

         */



        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be a password");
        }
        else{
            System.out.println("hello " + name );
        }
    }
}
