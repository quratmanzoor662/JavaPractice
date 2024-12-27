package collections;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayListCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qurat");
        list.add("saima");
        list.add("yasir");
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName :");
        String username = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), username)) {
                flag = true;
                break;
            }


        }
        if (flag) {
            System.out.println("Logged In");
        } else {
            System.out.println("Invalid Username");
        }

//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        System.out.println(num);

    }
}
