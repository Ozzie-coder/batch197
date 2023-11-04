package typecasting_2;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class IfElseIf03 {

    public static void main(String[] args) {

    /*
    Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C veya D yazdirin.
    1.50 den az - D    2. 50(dahil) ile 60 arasi -C
    3.60 (dahil) ile 80 arasi -B  4. 80(dahi) VE 100(dahil) -A
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not=scan.nextInt();

        if(not<0){
            System.out.println("Sana not gir dedi");
        }else if (not<50){
            System.out.println("D");
        }else if(not<60){
            System.out.println("C");
        }else if(not<80){
            System.out.println("B");
        }else if(not<=100){
            System.out.println("A");
        }else{
            System.out.println("Sana not gir dedik");
        }
        scan.close();

    }
}
