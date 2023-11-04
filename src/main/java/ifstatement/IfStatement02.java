package ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin. Bu sayi cift sayi ise console
        "Cift", tek sayi ise console "Tek" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir integer giriniz");
        int a = scan.nextInt();

        if(a%2==0){
            System.out.println("Cift");
        }

        if( a%2!=0){
            System.out.println("Tek");
        }
        scan.close();


    }
}
