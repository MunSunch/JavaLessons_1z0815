package Java_Course_Chapter2.Collections;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<>(5);
        a.add("a");
        a.add("b");
        a.add(new String(new char[]{'1','2','c'}));
        System.out.println(a.toString());;

        ArrayList<String> b = new ArrayList<>(a);
        System.out.println(b.toString());
        System.out.println(a==b);
        System.out.println(a.get(0)==a.get(0));
    }
}
