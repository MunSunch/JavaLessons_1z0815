package Java_Course_Chapter2.Collections;
/*
    add(Datatype d)          ---> boolean
    add(index i, datatype d) ---> void
    get(Datatype d)          ---> Datatype
    set(int index, Datatype d)--> Datatype
    remove(int index)/       ---> Datatype
    *remove(Object o)         ---> boolean
    addAll(ArrayList a)/
    addAll(int index, ArrayList a)boolean
    clear()                  ---> void
    isEmpty()                ---> boolean
    *indexOf(Object o)        ---> Datatype
    *lastIndexOf(Object o)    ---> Datatype

 */

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("aa");
        a.add("aaa");
        a.add(2, "aaaa");
        System.out.println(a.toString());

        a.set(1, "Masha");
        System.out.println(a);

        ArrayList<Element> b = new ArrayList<>();
        b.add(new Element("Arg"));
        b.add(new Element("Aug"));
        b.add(new Element("Na"));
        b.remove(new Element("Na"));
        int index = b.indexOf(new Element("Aug"));
        System.out.println(index);

        b.clear();
        System.out.println(b.isEmpty());

        ArrayList<String> c = new ArrayList<>();
        c.addAll(a);
        System.out.println(c);
        int res = c.indexOf("Masha");
        System.out.println(res);
    }
}

class Element{
    String name;
    Element(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name);
    }

}
