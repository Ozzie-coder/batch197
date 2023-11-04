package typecasting_2;

import java.util.Scanner;

public class IfElseIf02 {

    /*
    Kullanicidan bir ucgenin uc kenar uzunlugunu alin.
    Uc kenar uzunlugu birbirne esit ise ekrana "Eskenar ucgen" yazdirin.
    Sadece 2 kenar uzunlugu esitse ekrana "Ikizkenar ucgen" yazdirin.
    Tum kenar uzunluklari birbirinden farkli ise "Cesitkenar ucgen" yazdirin.
    */


    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin 3 kenarini giriniz");
    double u1 = scan.nextDouble();
    double u2 = scan.nextDouble();
    double u3 = scan.nextDouble();
    if(u1==u2 && u2==u3){
        System.out.println("Eskenar ucgen");
    }else if(u1==u2 || u2==u3 || u1==u3){
        System.out.println("ikizkenar ucgen");
    }else{
            System.out.println("Cesitkenar Ucgen");
            scan.close();
        }



    }




}
