package JavaSE_1z0815.Lesson18_Array;

//Рассмотрим статическую и динамическую инициализацию массива

public class ArrayTest_Init {
    public static void main(String[] args) {
        int[] array_1 = new int[5];
        //Статическая
        array_1[0] = 1;
        array_1[1] = 44;
        array_1[2] = 5;
        array_1[3] = 2;
        array_1[4] = 1;

        int[] array_2 = new int[5];
        //Динамическая
        for (int i=0; i<array_2.length; i++){
            array_2[i] = i;
        }

        //Динамическая инициализация двумерного массива с одномерными массивами различной длины
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[3];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                array[i][j] = i+j;
            }
        }

        //Инициализация другим массивом
        int[][] array3 = new int[2][3];
        int[] a = {1,2,3};
        array3[0] = a;
    }
}
