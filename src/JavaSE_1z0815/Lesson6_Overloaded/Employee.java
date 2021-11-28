package JavaSE_1z0815.Lesson6_Overloaded;

public class Employee {

    int id, age, department;
    String surname;
    double salary;

    public Employee(int id1, String surname1){
        id = id1;
        surname = surname1;
    }
    //Overload constructor + nested constructor
    Employee(int id2, String surname2, double salary2){
//        Employee(id2, surname2); // Заменим на this
        this(id2, surname2);
        salary = salary2;
    }
    Employee(int id3, String surname3, double salary3, int age3){
        this(id3, surname3, salary3);
        age = age3;
    }
}
