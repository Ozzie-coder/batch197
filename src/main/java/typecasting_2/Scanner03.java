package typecasting_2;

import java.util.Scanner;

public class Scanner03 {

    /*
    Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
    ekrana yazdiran programi yaziniz
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz");
        int s =scan.nextInt();

        //Bir sayinin birler basamagi lazim olursa "%10" kullanin.
        int sonRakam = s % 10;
        //4 basamakli bir sayinin ilk rakamini almak icin 1000`e bol
        //5 basamakli bir sayinin ilk rakamini almak icin 10000`e bol
        int ilkRakam = s / 1000;


        System.out.println("ilk rakam ve on rakam toplami:" + (ilkRakam+sonRakam) );

        scan.close();


    }
}