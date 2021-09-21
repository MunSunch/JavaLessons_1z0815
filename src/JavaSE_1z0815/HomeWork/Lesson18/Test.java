package JavaSE_1z0815.HomeWork.Lesson18;

public class Test {
    public static int[] sortirovka(int[] a) {
        int b;
        int j = 0;
        while (j != a.length-1) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    b = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = b;
                    j=0;
                } else{
                    j++;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 8, 0, -3, -5, 4, - 2, 22, 44, 51, 5};
        int[] res = sortirovka(a);
        for(int i:res)
            System.out.print(i + " ");
    }
}
