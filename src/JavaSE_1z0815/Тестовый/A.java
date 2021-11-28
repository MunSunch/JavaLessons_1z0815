package JavaSE_1z0815.Тестовый;

public class A {
    void abc(E e){
        System.out.println("A");
    }
}

class B extends A{
    void abc(F f1){
        System.out.println("B");
    }
}
class C extends B{
    void abc(F f2){
        System.out.println("C");
    }
}
class E{}
class F extends E{}
class T{
    public static void main(String[] args) {
        A a = new C();
        a.abc(new F());
    }
}