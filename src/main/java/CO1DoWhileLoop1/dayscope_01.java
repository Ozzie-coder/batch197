package CO1DoWhileLoop1;

import java.util.Scanner;

public class dayscope_01 {

    /*Ask user to enterg an integer. if The integer is less than 100, tell user Won
    otherwose, tell user You Lost!
     */


    public static void main(String[] args) {
        int num=0;
        /*

        do{
            Scanner input = new Scanner (System.in);
            System.out.println("Please Enter a Number...");
            num = input.nextInt();
            if (num<100){
                System.out.println("You Won!");
            }
        }   while (num<100);
        System.out.println(" You Lost!");

        */

        //Second Way:

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a Number...");
            num = input.nextInt();

            if(num>=100){
                System.out.println("You lost!");
                break;
            }
            System.out.println("You Won!");

        } while (true);


    }

}
