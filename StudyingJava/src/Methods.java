
public class Methods {
    public static void main(String[] args) {

       

        menuGoster();
        sayılarıTopla(10,15);
        sayılarıCıkar(3,2);
        sayılarıCarp(100,4);
        sayılarıBol(100,4);





    }
    public static void sayılarıTopla(int a, int b){
        System.out.println("Toplam: " + (a+b) );
    }
    public static void sayılarıCıkar(int a,int b){
        System.out.println("Fark: " + (a-b));
    }
    public static void sayılarıCarp(int a,int b){
        System.out.println("Çarpım: " + (a*b));
    }
    public static void sayılarıBol(int a,int b){
        System.out.println("Bölüm: " + (a/b));
    }

    public static void menuGoster(){
        System.out.println("********MENU********");
        System.out.println("1- İki sayının toplamını bul ");
        System.out.println("2- İki sayının farkını bul ");
        System.out.println("3- İki sayının çarpımını bul ");
        System.out.println("4- İki sayının bölümünü bul ");








    }








}
