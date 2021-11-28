package JavaSE_1z0815.Lesson9_this;

public class Life_of_object {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1 = null; // a1 поменяла адрес ----> предпочтительный объект для garbage collector'a
    } // scope local var a1 and a2 закончился ---> предпочтительные объекты для garbage collector'a
}
class A{}
