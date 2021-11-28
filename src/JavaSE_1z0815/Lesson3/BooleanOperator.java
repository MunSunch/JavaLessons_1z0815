package JavaSE_1z0815.Lesson3;
//Синонимия
public class BooleanOperator {
    public static void main(String[] args) {
        Dog d1 = new Dog("spot");
        Dog d2 = new Dog("scruffy");
        Dog d3 = d1;
        System.out.println(d1==d3);//true
        System.out.println(d1.equals(d3));//true

        System.out.println(d1==d2);

    }
}
class Dog{
    String name,
            says = "Hello, I am "+name;

    Dog(String name) {
        this.name = name;
    }
}