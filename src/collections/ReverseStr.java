package collections;

import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        String str="abcdefg";

        System.out.println(str);
        Stack<Character> st= new Stack<>();
        char[] ch = str.toCharArray();
        for (int i=0; i<str.length();i++){
            st.push(ch[i]);
        }
       for(int s=0; !st.isEmpty();s++)
       {
           ch[s]=st.pop();
       }
        String rev =String.copyValueOf(ch);
        System.out.println("reverse is : " +rev);
    }
}
