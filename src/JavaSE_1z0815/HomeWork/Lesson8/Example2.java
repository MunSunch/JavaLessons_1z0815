package JavaSE_1z0815.HomeWork.Lesson8;

public class Example2 {
    private static final double PI = 3.1415;
    public static double square(int R){
        return PI * R*R;
    }
    public static double length(int R){
        return PI * 2 * R;
    }

    public void info(int R){
        System.out.println("Радиус круга: " + R);
        System.out.println("Площадь круга: " + square(R));
        System.out.println("Длина круга: " + length(R));
    }
}
class Example2Test{
    public static void main(String[] args) {
        Example2 e = new Example2();
        e.info(12);
    }
}
