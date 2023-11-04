package ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

    /*
    if it rains i will cancel picnic
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(a>b){
            System.out.println("ilk sayi buyuk");
        }

        if(a<b) {
            System.out.println("ikinci sayi buyuk");
        }

        if(a==b){
            System.out.println("iki sayi esit");

        }
            scan.close();
    }
}
