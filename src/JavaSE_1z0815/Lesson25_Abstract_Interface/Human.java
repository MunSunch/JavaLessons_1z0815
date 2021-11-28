package JavaSE_1z0815.Lesson25_Abstract_Interface;

public class Human implements Swimmable, Shooter{
    int id=22;
    String name, surname;

    @Override
    public void swim() {
        System.out.println("Human is swimming");
    }

    @Override
    public void shot() {
        System.out.println("Human is shooting");
    }

    public static void main(String[] args) {
        Shooter s = new Human();
        System.out.println(s.id); // compile-time buiding: Shooter.id=11
    }
}
interface Swimmable{
    void swim();
}
interface Shooter{
    int id=11;
    void shot();
}