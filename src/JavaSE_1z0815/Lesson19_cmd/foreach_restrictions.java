package JavaSE_1z0815.Lesson19_cmd;

import java.util.Arrays;

public class foreach_restrictions {
    public static void main(String[] args) {
        //Невозможно изменить значения примитивного массива данных
        int[] array1 = {1, 2, 3, 4};
        for (int i : array1) {
            i = 10;
        }
//        System.out.println(Arrays.toString(array1));

        //Невозможно изменить элемент ссылочного массива, но можно изменить значение элемента
        StringBuilder[] array2 = {new StringBuilder("ok"), new StringBuilder("no"), new StringBuilder("Yelse")};
        for (StringBuilder sb : array2) {
            sb.append("lalala");
        }
//        System.out.println(Arrays.toString(array2));

        //Динамически инициализировать массив невозможно
        int[] array3 = new int[4];
        for (int i : array3) {
            i += 2;
        }
//        System.out.println(Arrays.toString(array3));

        //В обычном for loop можно было итерировать сразу два массива, в foreach это невозможно
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {1, 3, 3, 4, 6};
        for(int index = 0; index<array5.length; index++){
            if(array5[index] == array4[index]){
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

}
