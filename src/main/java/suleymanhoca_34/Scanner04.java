package suleymanhoca_34;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

      /*
      Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini alip
      o dikdortgenin cevresini heasplayip ekrana yazan programi
      olusturunuz.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double kisa = scan.nextDouble();
        System.out.println("Dikdortgenin uzun kenarini griniz");
        double uzun = scan.nextDouble();
        System.out.println("Alan= "+ kisa*uzun);
        System.out.println("Cevre= " + (2*kisa + 2*uzun));
        scan.close();







    }
}
