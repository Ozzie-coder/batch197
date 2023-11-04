package ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        /*
        kULLANICIDAN BIR SAYI ALIN.
        SAYI 3 BASAMAKLI ISE CONSOLE A  "3 Basamakli" yazdirin.
        Sayi 2 basamakli ise console a  "2 Basamakli" yazdirin.
        Sayi 3 basamakli veya 2 basamali degil ise  console a "ikisi de degil" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif integer giriniz");
        int a = scan.nextInt();


        if(a>99 && a<1000){
            System.out.println("3 basamakli");
        }
        if(a>9 && a<100){
            System.out.println("2 basamakli");
        }
        if(!(a>99 && a<1000) && !(a>9 && a<100)){
            System.out.println("ikisi de degil");
        }
        scan.close();
    }
}
