package day08_ternary;

import java.util.Scanner;

public class Ternary04 {

    public static void main(String[] args) {

        /*
        Kullanicidan alacagi urunun miktarini ve urunun birim fiyatini alin.

        Eger urun miktari 1000 den fazlaysa kullaniciya %10 indirim yapin ve
        odemesi gereken toplam parayi ekrana yazdirin.

        Diger durumlarda odemesi gereken toplam parayi herhangi bir indirm yapmadan ekrana yazdirin.
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Urun miktarini giriniz");

        int miktar = scan.nextInt();
        System.out.println("Urun birim fiyatini giriniz");
        double fiyat = scan.nextDouble();

        System.out.println(miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar);

        scan.close();
    }
}
