package JavaSE_1z0815.Lesson23_ООП;

public class KeySuper {
    String name;
    public KeySuper(String name){
        this.name = name;
        System.out.println("В конструкторе KeySuper");
    }
}
class A extends KeySuper{
    public A(String name) {
        super(name);
        System.out.println("В конструкторе A");
    }

    //Super и this можно комбинировать
    int course;
    public A(String name, int course){
        super(name);
        this.course = course;
    }
}

class TestKeySuper{
    public static void main(String[] args) {
        A a = new A("Kolya");
        System.out.println(a.name);
    }
}
