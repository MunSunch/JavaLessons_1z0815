package JavaSE_1z0815.Lesson9;

public class Car {
    int count; // instance var видна во всём класса Car

    //    static int id = this.count; // instance Car ещё не создан, поэтому и this еще не существует
    public Car(int count) {
        this.count = count; // Scope instance count and parameter var пересекаются
    }

    void abc(int count) {
        System.out.println(count); // параметр перекрывает Instance count
        System.out.println(this.count); // this указывает на принадлежность count экземпляру класса
    }

    //    Объект Car еще не создан, поэтому вызов abc() невозможен
    public static void abcd() {
//        this.abc();
        System.out.println("import ................");
    }

    public static void main(String[] args) {
        Car c = new Car(11);
        c.abc(10);

    }
}