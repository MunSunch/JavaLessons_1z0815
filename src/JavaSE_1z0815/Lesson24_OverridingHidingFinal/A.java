package JavaSE_1z0815.Lesson24_OverridingHidingFinal;

//buiding
public class A {
    int i = 11;

    public static void printer() {
        System.out.println("Печатаю A");
    }

    public void printer_A() {
        System.out.println("Печатаю A");
    }
}

class B extends A {
    double i = 122.12;


    public static void printer() {
        System.out.println("Печатаю B");
    }

    public void printer_A() {
        System.out.println("Печатаю B");
    }

}

class Test {
    public static void main(String[] args) {
        B a = new B();
        a.printer(); //Какой метод выполнится?????
        System.out.println(a.i);
    }
}
