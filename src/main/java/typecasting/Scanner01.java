package typecasting;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        /*
        Kenar uzunluklari kullanicidan alinan bir ucgenin cevresini
        hesaplayan bir program yaziniz. (byte kullaniniz)
        Not: Ucgen cevresi: a+b+c
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        byte k1 = scan.nextByte();
        byte k2 = scan.nextByte();
        byte k3 = scan.nextByte();

        int cevre = k1 + k2 + k3;

        // Parentez iclerini mumkun oldugu kadar basit tutun
        System.out.println("Cevre: "+ cevre);
        scan.close();

    }


}