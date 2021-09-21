package JavaSE_1z0815.Lesson8;

public class Car {
    String color;
    String engine = "V6";
    public Car(String c){
        color = c;
    }
}

class Human{
    String name;
    Car car = new Car("red"); //(1)
//    final Car car = new Car("red"); //(2)
}

class Test_test{
    public static void main(String[] args) {
        Human h = new Human();
//        Создадим человека с машиной красного цвета, потом переобозначим машину белого цвета(1)
        System.out.println(h.car.color);
        Car car1 = new Car("white");
        h.car = car1;
        System.out.println(h.car.color);
//         Теперь поставим final. Видим, что компилятор не дает это совершить(2)
    }
}