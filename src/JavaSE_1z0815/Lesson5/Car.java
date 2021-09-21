package JavaSE_1z0815.Lesson5;

public class Car {
    // Цвет и мотор машины
    String color, engine;

    Car(){} // Тоже User defined constructor, так как явно прописан
    //User defined
    Car(String a, String b){
        color = a;
        engine = b;
        show();
    }
    void show(){
        System.out.println("Color: " + color +"\n"+"Engine: " + engine);
    }
}

class CarTest{
    public static void main(String[] args) {

        Car audi = new Car("red", "v8");
    }
}
