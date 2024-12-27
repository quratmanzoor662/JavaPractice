package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCollection {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
         names.add("apple");
         names.add("mango");
         names.add("orange");
         names.add("banana");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit");
        String  str = sc.nextLine();

        names.set(1,str);
        System.out.println(names);


    }
}
