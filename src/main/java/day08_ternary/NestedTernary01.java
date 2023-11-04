package day08_ternary;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi girmesini isteyin.

        Tamsayi 3 bsaamakli ise ekrana "3 basamakli" yazdirin.

        3 basamakli degilse cift olup olmadigini kontrol edin.
        Cift ise "3 basamakli olmayan cift sayi" yazdirin.
        Cift sayi degilse "3 basamakli olmayan tek sayi" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");

        int s = scan.nextInt();

        System.out.println(s>99 && s<1000 ? "3 Basamakli" : s%2==0 ? "3 basamakli olmayan cift" : "3 basamakli olmayan tek sayi" );

        scan.close();




    }
}
