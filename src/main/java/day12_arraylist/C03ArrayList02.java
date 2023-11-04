package day12_arraylist;

import java.util.ArrayList;

public class C03ArrayList02 {

    public static void main(String[] args) {

        // Example: Create a Character list which has repeated elements then remove the dublicates
        //        [J, a, v, a, c] -----> [J, a, v, c]
        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');
        System.out.println(a);  // [J, a, v, a, c]

        ArrayList<Character> b = new ArrayList<>();

        for (Character w: a){




            if (!b.contains(w)){



                b.add(w);


            }
        }
        System.out.println(b);







    }

}
