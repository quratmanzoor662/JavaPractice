package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue<String> qurat = new LinkedList<>();

        qurat.add("salim");
        qurat.add("salma");
        qurat.add("saima");
        qurat.add("haris");
        qurat.add("abc");
       // qurat.remove();
//         String peek= qurat.peek();
//System.out.println("peek element: "+peek);

        java.util.Queue<String> sama = new ArrayDeque<>();

        sama.add("Apple");
        sama.add("Ant");
        sama.add("Cat");
        sama.add("ball");
//        System.out.println(sama.contains("Afff"));

        System.out.println(qurat);
    }
}
