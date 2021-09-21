package JavaSE_1z0815.HomeWork.Lesson18;

public class Test2 {
    public static void showArray(int[][] array) {

        System.out.println("{" + " {" + array[0][0] + ", " + array[0][1] + "}, " + array[1][0] +
                ", {" + array[1][0] + ", " + array[1][1] + "} }");
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        showArray(m);

    }
}
