package day08_ternary;

import java.util.Scanner;

public class NestedIfSoru03 {

    public static void main(String[] args) {
    /*
    Kullanicidan password girmesini isteyiniz.

    Girdigi pswrd 5'e bolunuyorsa son rakamini kontrol edin.
    Son rakam 0 ise "5'e bolunen cift sayi" yazdirin.
    Son rakam 0 degil ise "5'e bolunen tek sayi" yazdirin.

    Girdigi pswrd 5'e bolunmuyorsa "Tekrar deneyin" yazdirin.
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir pwd giriniz");
        int pwd = scan.nextInt();

        if(pwd%5==0){
            if(pwd%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }else{
            System.out.println("Tekrar deneyin");
        }
        scan.close();


    }
}
