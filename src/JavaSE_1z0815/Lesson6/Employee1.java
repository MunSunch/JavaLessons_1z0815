package JavaSE_1z0815.Lesson6;

// Реализация второго метода
public class Employee1 {
    int id, age, department;
    String surname;
    double salary;

    Employee1(int id1, String surname1) {
        this(id1, surname1, 0.0, 0);
    }

    Employee1(int id2, String surname2, double salary2) {
        this(id2, surname2, salary2, 0);
    }

    Employee1(int id3, String surname3, double salary3, int age3) {
        id = id3;
        surname = surname3;
        salary = salary3;
        age = age3;
    }
}
