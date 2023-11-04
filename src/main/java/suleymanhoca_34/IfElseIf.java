package suleymanhoca_34;

import java.util.Scanner;

public class IfElseIf {

    /*
    Kullanicidan bir sayi alin.
    Eger tamsayi O dan kucuk ise ekrana "Negatif yazdirin.
    O ise ekrana "Notr", o dan buyuk ise "Pozitif" yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        double d = scan.nextDouble();

        if(d<0) {
            System.out.println("Negatif");
        }else if(d==0){
            System.out.println("Notr");
        }else{
            System.out.println("Pozitif");
            scan.close();



        }



    }



}
