package day12_arraylist;

import java.util.ArrayList;

public class C02ArrayList01 {

    public static void main(String[] args) {

        // Arrays List is used to store multiple with flexible length
        // We must decide number of elements when declare Arrays
        // This might cause some problems in many occasions.
        // Java created a new structure to store multiple elements ---> Array Lists (list)
        // Array Lists store non-primitive data type but Arrays store primitive data types and references
        // Why Java did not remove Arrays ----> i) Arrays save memory   ii) Arrays are faster

        // How to create Array List:
        ArrayList<Integer> myList = new ArrayList<>();

        // How to print list on the console:
        System.out.println(myList);

        // How to add elements to Array list:
        myList.add(13);
        myList.add(25);
        myList.add(5);  // add() mtd adds element to the end of the list

        myList.add(1,7);
        myList.add(3,9);

        ArrayList<Integer> m = new ArrayList<>();
        m.add(99);
        m.add(88);
        m.add(77);
        System.out.println(m);

        myList.addAll(m); // addAll() mtd is used to add list to another list

        myList.addAll(2,m); // Inserts all of the elements in the specified collection into this list, starting at the specified position.

        System.out.println(myList);

        // How to remove element:
        myList.remove(2);  // Removes the element at the specified position in this list.
        // Shifts any subsequent elements to the left (subtracts one from their indices).
        myList.remove(myList.get(4));

        // How to get specific element:
        int element = myList.get(1);
        System.out.println(element);

        // How to update an element:
        myList.set(2,11);  //  Replaces the element at the specified position in this list with the specified element.

        System.out.println(myList);

        // Example: Create an Integer Array list and chage all odd numbers to 11

        ArrayList<Integer> a = new ArrayList<>();
        a.add(23);
        a.add(13);
        a.add(8);
        a.add(22);
        a.add(17);
        System.out.println(a);

        for (Integer w:a){
            if (w%2!=0){
                a.set(a.indexOf(w),11);  // Returns the index of the first occurrence of the specified element in this list,
                                        // or -1 if this list does not contain the element

            }
        }
        System.out.println(a);

        // Example: Create a String Array List and remove the elements that contains "a":
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("New York");
        cities.add("Tamba");
        cities.add("Virginia");

        System.out.println(cities);  // [Miami, Naw York, Tamba, Virginia]

        for ( int i = 0; i<cities.size(); i++){

            String city = cities.get(i);
            if (city.contains("a")){

                cities.remove(city);
                // cities.remove(i);
                i--;
            }
        }
        System.out.println(cities);















    }

}
