package typecasting_2;

import java.util.Scanner;

public class IfElseIF04 {

    public static void main(String[] args) {
    /*
    Kullanicidan bir yil alin eger yil 1000`e bulunuyorsa ekrana "Milenyum" yazdirin.
    Eger yil 100`e bulunuyorsa ekrana "Yuzyil" yazdirin.
    Eger yil 10`a bulunuyorsa ekrana "Onyil" yazdirin.
    */
    Scanner scan = new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int yil= scan.nextInt();

        if(yil%1000==0){
            System.out.println("Milenyum");
        }else if(yil%100==0){
            System.out.println("Yuzyil");
        }else if(yil%10==0){
            System.out.println("Onyil");
        }else{
            System.out.println("Hicbiri degil");
        }
        scan.close();


    }
}
