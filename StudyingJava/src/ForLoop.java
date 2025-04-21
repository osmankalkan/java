import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);


        /*
        for (int i = 1; i <= 5; i++ ){
            System.out.println(i);
        }

         */
        /*
        for (int i = 5; i >= 1; i-- ){
            System.out.println(i);
        }

         */

        /*
        int toplam = 0;
        for (int i =1 ; i <= 5; i++){
            toplam+=i;

        }
        System.out.println("Toplam: " + toplam);

         */

        /*

        for (int i = 1 ; i <=10 ; i++){
            if ((i == 5)){
                break;
            }
            System.out.println(i);
        }



        for (int i = 1 ; i<= 10 ; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

         */

        int start = 10;

        for(int i = start; i > 0 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }

        System.out.println("Irmağı cok seviyorumm💜!");






    }
}
