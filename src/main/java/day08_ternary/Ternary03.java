package day08_ternary;

import java.util.Scanner;

public class Ternary03 {

    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin.
        Eger iki kenar uzunlugu birbirine esit ise ekrana "ikizkenar Ucgen" yadirin.
        Diger durumlarda ekrana "ikizkenar degil" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

        System.out.println(k1==k2 || k2==k3 || k1==k3 ? "Ikiz kenar Ucgen" : "ikizkenar degil");
        scan.close();


    }
}
