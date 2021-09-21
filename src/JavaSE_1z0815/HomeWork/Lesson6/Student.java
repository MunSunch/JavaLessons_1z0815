package JavaSE_1z0815.HomeWork.Lesson6;

public class Student {
    int id;
    String name, lastname;
    int year;
    int math, economic, english;
    double res;
    int course;

    Student(int id1, String name1, String lastname1, int year1, int math1, int economic1, int english1, double res1, int course1) {
        id = id1;
        name = name1;
        lastname = lastname1;
        year = year1;
        math = math1;
        economic = economic1;
        english = english1;
        res = res1;
        course = course1;
        System.out.println("Student create");
    }

    Student(int id2, String name2, String surname2) {
        this(id2, name2, surname2, 0, 0, 0, 0, 0.0, 0);
    }

    public Student() {
        this(0, null, null, 0, 0, 0, 0, 0.0, 0);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "name", "surname");
        Student s3 = new Student(2, "nameee", "surnamesss", 3, 2, 1, 3, 3.3, 4);
    }
}
