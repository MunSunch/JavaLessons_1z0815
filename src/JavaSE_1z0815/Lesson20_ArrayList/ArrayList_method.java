package JavaSE_1z0815.Lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
/*
    add(DataType d) -->void
    get(int index)--->int
    *remove(int index)/ remove(Object o) --->void
    addAll(ArrayList a)/ addAll(int index, ArrayList a) ---> void
    clear()--->void
    *indexOf(Object o) --->int
    *lastIndexOf(Object o) --->int
    set(int index, Object o) ---> void
    size() --->int
    isEmpty() --->boolean
    *contains(Object o) --->boolean
    toString() --->String
 */
public class ArrayList_method {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //Добавить на позицию с таким то индексом, по умолчанию на последнюю
        array.add("sdsd");
        array.add("ewv");
        array.add(1, "ok");
//        System.out.println(array.toString());

        //Получить элемент по индексу
        for (int i = 0; i < array.size(); i++)
//            System.out.println(array.get(i));

        //Удалить элемент по индексу либо по объекту
        array.remove("sdsd");
        System.out.println(array.toString());
        /* Remove проходит по всем элемента массива и сравнивает их с инпут обьектом методом equals()
        (который не у каждого обьекта определен). И поэтому даже если их содержимое одинаково, remove
        может ничего не удалить */
        ArrayList <StringBuilder> ar_sb = new ArrayList<>();
        ar_sb.add(new StringBuilder("fdrea"));
        ar_sb.remove(new StringBuilder("fdrea")); //sb1.equals(sb2) = sb1==sb2 ---> false
//        System.out.println(ar_sb.toString());
        System.out.println();

        //Заменить элемент с каким-то индексом на какой-то элемент
        System.out.println(array);
        array.set(0, "bye-bye");
        System.out.println(array);

        //Узнать индекс первого вхождения указанного элемента
        int index = array.indexOf("bye-bye");
        System.out.println(index);
        //Узнать индекс последнего вхождения указанного элемента
        array.add("bye-bye");
        index = array.lastIndexOf("bye-bye");
        System.out.println(index);
        //Узнать существует ли такой-то элемент
        System.out.println("Существует ли такой элемент? " + array.contains("bye-bye"));
        System.out.println();

        //Узнать количество элементов
        System.out.println("Количество элементов составляет " + array.size());
        //Узнать пустой ли массив или нет. Если size()--->0, то true.
        System.out.println("Массив пуст? " + array.isEmpty());

        //Строковое представление ArrayList'a
        System.out.println("Строковое представление ArrayList'a: " + "\t" + array.toString());
        System.out.println();

        //Удалить всё
        array.clear();
        System.out.println("Массив после метода clear() пуст? " + array.isEmpty());

    }
}
