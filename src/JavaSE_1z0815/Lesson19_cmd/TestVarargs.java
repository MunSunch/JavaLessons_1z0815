package JavaSE_1z0815.Lesson19_cmd;

public class TestVarargs {
    public static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println("Сумма составляет " + summa);
        System.out.println(s);
    }

    //Методы не будут перегруженными, так как после компиляции varargs переводится в массив
//    public static void summa(String s, int [] a){
//        int summa = 0;
//        for(int i=0; i<a.length; i++){
//            summa+=a[i];
//        }
//        System.out.println("Сумма составляет " + summa);
//        System.out.println(s);
//    }

    //Комбинация varargs+array
    public static void abc(int[]... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].length + "\t");
        }
    }

    public static void main(String[] args) {
        summa("Tolya", 1, 2, 3);
        summa("Tolya", 2, 3, 4, 5, 6, 6, 7);
        summa("Tolya", new int[]{1, 2, 3, 4});
        abc(new int[]{1, 2, 3, 5}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
    }
}
