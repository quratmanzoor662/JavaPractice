package collections;

import java.util.Stack;

public class StackCollections {

    public static void main(String[] args) {

        Stack<String> sea = new Stack<>();

        sea.push("blue");
        sea.push("pink");
        sea.push("yellow");
        sea.push("orange");
        System.out.println(sea);
        sea.pop();
        sea.pop();
        sea.pop();
        sea.push("maginta");
        System.out.println(sea);



    }

}
