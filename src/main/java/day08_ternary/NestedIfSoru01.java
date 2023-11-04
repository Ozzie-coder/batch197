package day08_ternary;

import java.util.Scanner;

public class NestedIfSoru01 {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini girmesini isteyin.

        Erkek ise yasini kontrol edin.
        18`den kucukse "Erkek Cocuk" yadirin.
        18`den buyukse "Adam" yazdirin.

        Kadinsa yasini kontrol edin.
        18`den kucukse "Kiz Cocuk" yazdirin.
        18`den buyukse "Kadin" yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz: Erkek/Kadin");
        String c = scan.next();
        System.out.println("Yasinizi giriniz");
        int y = scan.nextInt();


        if (c.equalsIgnoreCase("Erkek")) {
            if (y < 18) {
                System.out.println("Erkek Cocuk");
            } else {
                System.out.println("Adam");
            }

        } else if (c.equalsIgnoreCase("kadin")) {
            if (y < 18) {
                System.out.println("Kiz Cocuk");
            } else {
                System.out.println("Kadin");
            }
        } else {
            System.out.println("Bu cinsiyet tanimli Degil");
        }
        scan.close();
    }


    }