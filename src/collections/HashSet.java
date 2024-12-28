package collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        Set<String>set= new java.util.HashSet<>();
        set.add("qurat");
        set.add("saima");
        set.add("iqra");

//        System.out.println(set);
        Set<Integer> tree= new TreeSet<>();
        tree.add(2);
        tree.add(6);
        tree.add(8);
//        tree.remove(6);
        System.out.println(tree);
        Set<String> linkedlist = new LinkedHashSet<>();
        //differnce in insertion and deletion
        linkedlist.add("faisal");
        linkedlist.add("huxaif");
        linkedlist.add("yasir");
//        System.out.println(linkedlist);
    }
}
