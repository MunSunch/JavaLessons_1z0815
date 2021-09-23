package JavaSE_1z0815.Lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    clone() --->ArrayList<>
    Arrays.toArray() --->Object[]
    Arrays.toArray(Datatype<> d) ---> Datatype[]
    Collections.sort(ArrayList<> array) ---> void
 */
public class ArrayList_related_methods {
    public static void main(String[] args) {
        ArrayList <StringBuilder> a1 = new ArrayList<>();
        a1.add(new StringBuilder("one"));
        a1.add(new StringBuilder("two"));
        a1.add(new StringBuilder("three"));
        System.out.println(a1.toString());

        // Метод clone() создает новый ArrayList и копирует в него адреса элементов другого ArrayList'a
        ArrayList <StringBuilder> a2 = (ArrayList<StringBuilder>) a1.clone();
        System.out.println(a1 == a2);
        System.out.println(a1.get(0) == a2.get(0));
        // Адреса элементов одинаковы, дополнительно убедимся в этом
        a1.get(0).append(22);
        System.out.println(a2.get(0));
        // Удалим элемент и на его место поставим другой
        a1.set(0, new StringBuilder("5"));
        System.out.println(a2.get(0)); // Адрес элемента в клонированном ArrayList'e не изменился
        System.out.println();

        //Превращение ArrayList'a в массив, при этом ссылки копируются!!!
        Object[] o = a2.toArray();
        StringBuilder[] sb = a2.toArray(new StringBuilder[4]);
        //Убедимся в этом
        System.out.println(sb[0] == a2.get(0));

        //Превращение массива в List, при этом ссылки копируются!!!
        List<StringBuilder> list = Arrays.asList(sb);
        System.out.println();

        //Сортировка ArrayList'a
        ArrayList<String> al = new ArrayList<>();
        al.add("B");
        al.add("D");
        al.add("A");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }
}
