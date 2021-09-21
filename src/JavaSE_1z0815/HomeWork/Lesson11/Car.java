package JavaSE_1z0815.HomeWork.Lesson11;

public class Car {
    String color,engine;
    int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

}
class CarTest{
    public static void changeDoor(Car car, int door){
        car.door = door;
    }
    public static void swapColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
    public static void main(String[] args) {

        Car c1 = new Car("green", "v8", 4);
        Car c2 = new Car("white", "v6", 4);
        changeDoor(c1, 6);
        swapColor(c1, c2);
        System.out.println(c1.color);
    }
}
