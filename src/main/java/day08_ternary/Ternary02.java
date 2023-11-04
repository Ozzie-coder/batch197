package day08_ternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi alin.
        Eger tam sayi 0 dan kucuk ise ekrana "Negatif" yazdirin.
        Diger durumlarda ekrana "Negatif degil" yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");

        int s = scan.nextInt();

        System.out.println(s<0 ? "Negatif" : "Negatif degil");

        scan.close();
    }
}
