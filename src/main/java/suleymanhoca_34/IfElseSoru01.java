package suleymanhoca_34;

import java.util.Scanner;

public class IfElseSoru01 {
    public static void main(String[] args) {

/*
Kullanicidan alacagi urun miktarini ve urun birim fiyatini alin.
Eger urun miktari 1000 den fazlaysa kullaniciya %10 indirim yapin
ve odemesi gereken toplam parayi ekrana yazdirin. Diger durumlarda
odemesi gereken toplam parayi herhangi bir indirim yapmadan ekrana
yazdirin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun Miktarini Girin");
        int qty = scan.nextInt();
        System.out.println("Urun birim fiyatini giriniz");
        double price = scan.nextDouble();

        if(qty>1000){
            System.out.println("%10 indirimli fiyat:" + price*0.9*qty);

        }else{
            System.out.println("Indirimsiz fiyat:" +price*qty);
            scan.close();
        }




    }
}
