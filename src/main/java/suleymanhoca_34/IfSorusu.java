package suleymanhoca_34;

import java.util.Scanner;

public class IfSorusu {

    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin.
        "Cuma" ise "Muslumanlar icin Kutsal" yazdiriniz.
        "Cumartesi" ise "Yahuduiler icin Kutsal" yazdiriniz.
        "Pazar" ise " Hristiyanlar icin Kutsal" yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String day = scan.next();
        // Stringlerde kesinlikle == kullanmiyoruz. String de hazir olan methodlardan equals() methodu kullaniyoruz.
        // equals() methodu 2 String i buyuk kucuk harfe bakarak karsilastirir.
        //"==" primitive data type`larinda kullanin.
        // equalsIgnoreCase() buyuk kucuk harfi ignore eder.
        // String`ler ayniysa true, farkliysa false return eder.

        if (day.equalsIgnoreCase("Cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (day.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!day.equalsIgnoreCase("Cuma") && !day.equalsIgnoreCase("Cumartesi")  && !day.equalsIgnoreCase("Pazar")){
            System.out.println("Oyle bir kutsal gun yok");
            scan.close();
        }


    }
}