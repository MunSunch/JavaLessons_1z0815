package JavaSE_1z0815.Lesson18_Array;

//класс Arrays не подгружается поэтому импортируем его
import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] a = {1, 3, 0, 3, 5, -1};

        // Рассмотрим метод sort()
        // Но для начала выведем массив
        printMassiv(a);
        Arrays.sort(a); //Метод отсортировывает массив по возрастанию
        printMassiv(a);

        // Рассмотрим метод binarySearch(), который выдает индекс найденного элемента
        // Корректно работает только в отсортированном массиве
        // Если число не найдено, то возвращает отрицательное значение с возможным индексом
        int index = Arrays.binarySearch(a, 2);
        System.out.println(index);

        int[] b = {1, 4, 2, 4, 5, 6};
        System.out.println(Arrays.binarySearch(b, 2));

//        String[][] s = new String[][];

        int[] a_1 = {1, 2, 3};
        int[] a_2 = {1, 2, 3};
        System.out.println(Arrays.equals(a_1, a_2));








    }

    public static void printMassiv(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
