package ifstatement;

import java.util.Scanner;

public class IfElse01 {

    public static void main(String[] args) {

        // if i rains I will go to Mall else I will go to picnic.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir integer giriniz");
        int a = scan.nextInt();
        // if -else sadece 1 condition icerir, ikili if ise 2 tane condition icerir.
        //Java her condition i kontrol eder, iki condition kontrol etmek
        // daha uzun zaman alir ve bu Javayi yavaslatir.
        if(a>=0){
            System.out.println("Negatif degil");

        }else{
            System.out.println("Negatif");

        }
        scan.close();



    }
}
