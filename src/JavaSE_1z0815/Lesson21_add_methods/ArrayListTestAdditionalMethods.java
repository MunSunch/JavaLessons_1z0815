package JavaSE_1z0815.Lesson21_add_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    removeAll(Collection<?> c) ---> void
    retainAll(Collection<?> c) ---> void
    containsAll(Collection<?> c) ---> boolean
    toArray() ---> Object[]
    toArray(T ) ---> T[]
 */
public class ArrayListTestAdditionalMethods {
    public static void main(String[] args) {
        //Удалить элементы одной коллекции из другой коллекции, если они есть
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("four");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("one");
        a2.add("three");
        a2.add("five");
//        a1.removeAll(a2);
//        System.out.println("a1 = " + a1 + " - изменённый ");
//        System.out.println("a2 = " + a2);

        // Оставляет элементы в листе, которые есть в другом массиве, другие удаляет
//        a1.retainAll(a2);
//        System.out.println("a1 = " + a1 + " - изменённый ");
//        System.out.println("a2 = " +

        //Содержит ли a1 ВСЕ элементы a1
        boolean what = a1.containsAll(a2);   // false, т к в a1 нет "five", который есть в a2
//        System.out.println("Содержит ли a1 ВСЕ элементы a1? " + what);
        //Проверим какой именно
//        if(!what){
//            for(String s2: a2){
//                if(a1.contains(s2)){}
//                else{
//                    System.out.println("Отсутствует этот элемент: " + s2);
//                    break;
//                }
//            }
//        }
        System.out.println();

        // Сделать из ArrayList'a массив определённого типа
//        String[] s = a1.toArray(new String[2]); //Укажешь длину<a1.size(), то все-равно создается массив с длиной=a1.size()
//        System.out.println(Arrays.toString(s));

        // Создать неизменяемый лист
        List<String> list1 = List.of("a", "b", "c", "d");
//        list.add("dsf");

        // Копирует элементы из ArrayList'a в лист
        List<String> list2 = List.copyOf(a1);
        System.out.println("list2 = " + list2);
    }
}
