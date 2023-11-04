package ifstatement;

import java.util.Scanner;

public class IfElse03 {

    public static void main(String[] args) {
        /*Kullanicidan bir tam sayi alin ve o tam sayinin mutlak degerini
        ekrana yazdiriniz. a>=0 ====> Mutlak Deger =a    a<=0 ====> Mutlak Deger -a
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int a = scan.nextInt();

        if(a>=0){
            System.out.println(a);

        }else{
            System.out.println(-a);

        }
            scan.close();

    }
}
