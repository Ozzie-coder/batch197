package deneme_1;

public class C05WhileLoop02 {

    public static void main(String[] args) {

        //Type a code to print even munbers from 15 to 5

        int i=15;
        while(i>4) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i--;
        }

            //Example: Type a code to check if a given number is Palindrome or not
            // 12321 ----> palindrome  12312--->not palindrome

            int num = 1203;
            String numStr = String.valueOf(num); //convert int to string ----> "12321"
            String reversed = "";

            int k= numStr.length()-1;
            while(k>=0){
                reversed = reversed + numStr.charAt(k);
                k--;
            }
            if (numStr.equals(reversed)) {
                System.out.println("Palindrome");
            }else {
                System.out.println("Not Polindrome");
            }




        }

}
