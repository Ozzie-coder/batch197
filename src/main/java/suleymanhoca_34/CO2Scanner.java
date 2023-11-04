package suleymanhoca_34;

import java.util.Scanner;

public class CO2Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Alfabe`den bir Harf Gir");
        //Kullanicidan alldiginiz data type char is asagidaki kodu yaz.
        char harf = scan.next().charAt(1);

        System.out.println(harf);
        scan.close();






    }
}