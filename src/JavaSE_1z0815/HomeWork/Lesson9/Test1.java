package JavaSE_1z0815.HomeWork.Lesson9;
// Без запуска, устно определить output
public class Test1 {
    int a = 2;
//    static int a =1;
    // Identifiers variable одинаковы, что недопустимо
}

class Test2{
    int a = 1;
    static int b = 2;
    static void abc(final int a){
        System.out.println(a); // Scope параметра a перекроет scope instance a
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        Test2 t =new Test2();
        abc(5);
        // 5
        // 2
    }
}

class Test3{
    int a=1;
    static int b=2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a); // Опять же, scope параметра перекроет scope instance a
        System.out.println(this.a); // Указание на instance a
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t=new Test3();
        t.abc(4);
        // 2
        // 4
        // 1
        // 2
    }
}
