package JavaSE_1z0815.Lesson18_Array;
import java.util.Arrays;
public class Array_equals {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(a1.equals(a2));

        System.out.println(Arrays.equals(a1, a2));
    }
}
