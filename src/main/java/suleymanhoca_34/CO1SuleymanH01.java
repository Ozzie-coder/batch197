package suleymanhoca_34;

import java.util.Scanner;

public class CO1SuleymanH01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi giriniz");

        // Data type`i String se nextLine() method kullan.
        // Data type String oldugunda next() method u da kullanilabilir.
        // next() methodu sadece ILK KELIME yi alir
        //nextLine() ise kullanicinin girdigi String in TAMAMINI alir.
        String name = scan.next();
        System.out.println(name);
        scan.close();

    }
}
