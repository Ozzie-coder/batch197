package day08_ternary;

import java.util.Scanner;

public class NestedIfSoru02 {

    public static void main(String[] args) {
        /*
        Kullanicidan bir harf girmesini isteyin.

        Girdigi  kucuk harfse harfin "a" olup olmadigini kontrol edin.
        Harf "a" ise ekrana "Ilk kucuk harf" yazdirin.
        "a"degilse ekrana "ilk kucuk harf degil" yazdirin.

        Girdigi buyuk harfse "Z" olup olmadigini kontrol edin.
        Harf "Z" ise ekrana "Son buyuk harf" yazdirin.
        "Z" degilse ekrana "Son Buyuk Harf Degil" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Harf Giriniz");

        char h = scan.next().charAt(0);

        if(h>='a' && h<='z'){
            if(h=='a'){
                System.out.println("ilk kucuk harf");
            }else{
                System.out.println("Ilk kucuk harf degil");

            }
        }else if(h>='A' && h<='Z'){
            if(h=='Z'){
                System.out.println("Son buyuk harf");
            }else{
                System.out.println("Buyuk Harf Degil");

            }
        }else{
            System.out.println("Lutfen Harf Giriniz");
        }
        scan.close();

    }
}
