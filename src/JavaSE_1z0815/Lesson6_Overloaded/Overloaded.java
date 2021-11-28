package JavaSE_1z0815.Lesson6_Overloaded;

public class Overloaded {
    //Overloaded
    void show() {
        System.out.println("show()");
    }

    void show(int a) {
        System.out.println("show(" + a + ")");
    }

    void show(int x, int y) {
        System.out.println("show(" + x + ", " + y + ")");
    }

    void show(String n, int b) {
        System.out.println("show(" + n + ", " + b + ")");
    }

    void show(int b, String n) {
        System.out.println("show(" + b + ", " + n + ")");
    }

}

class Test_Test6_1 {
    public static void main(String[] args) {
        Overloaded t = new Overloaded(); // Default constructor
        t.show();
        t.show(10);
        t.show(10, 11);
        t.show("space", 12);
        t.show(12, "space");
    }
}