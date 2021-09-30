package JavaSE_1z0815.Lesson10_import;
//import JavaSE_1z0815.Lesson9.Car;
//import JavaSE_1z0815.Lesson8.Car; //    При этом импорт из разных пакетов классов с одинаковыми
//    идентификаторами вызывает ошибку компиляции.
// Импорт всех классов из пакета

import JavaSE_1z0815.Lesson9.*;

public class Test10 {
    static void abcd() {
        System.out.println("Test10..........");
    }

    public static void main(String[] args) {
        // И в том, и в том пакете имеется Car. Придется прописывать полное имя класса
        JavaSE_1z0815.Lesson9.Car c9 = new JavaSE_1z0815.Lesson9.Car(1);
        JavaSE_1z0815.Lesson8.Car c8 = new JavaSE_1z0815.Lesson8.Car("white");

        Identificator d = new Identificator();
        // Сначала JVM будет искать метод в этом классе, потом, если не найдет, то ищет в других класса, указанных в импорте
        abcd();
        JavaSE_1z0815.Lesson9.Car.abcd();
    }
}
