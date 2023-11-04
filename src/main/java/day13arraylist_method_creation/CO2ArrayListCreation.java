package day13arraylist_method_creation;

import java.util.ArrayList;
import java.util.Arrays;

public class CO2ArrayListCreation {

    public static void main(String[] args) {

        //Example: Create a Character List which has repeated chars and remove dublicaes
        //[J, a, v, a,c]---->[J,a,v,c]

        ArrayList<Character> a = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        System.out.println(a);

        ArrayList<Character> b = new ArrayList<>();


        for(Character w: a){
            if (!b.contains(w)){
                b.add(w);

            }
        }

            System.out.println(b);

        }



}









