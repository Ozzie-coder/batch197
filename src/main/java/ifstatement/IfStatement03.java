package ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir character alin.
        Bu character buyuk harf ise "Buyuk Harf" yazdirin
        Bu character kucuk harf ise "Kucuk Harf" yazdirin.
        Harf degilse "Harf Degil" yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir character giriniz");
        char ch = scan.next().charAt(0);

        if(ch>='A' && ch <= 'Z'){
            System.out.println("Buyuk Harf");
        }
        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }
        if(!(ch>='A' && ch <= 'Z') && !(ch>='a' && ch<='z')) {
            System.out.println("Harf Degil");
        }

        scan.close();

        /*
        Logical Operator
        1) true && true  = true
           true && false = false
           false && true = false
           false && false= false

        2) true  || false =false
           false || true  =true
           true  || true  = true
           false|| false = false
        3) ! true = false
           ! false = true

         */





    }
}
