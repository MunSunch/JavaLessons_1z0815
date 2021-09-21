package JavaSE_1z0815.HomeWork.Lesson12;

import JavaSE_1z0815.Lesson11.Student;

public class StudentTest {

    public static void equalsStudents_1(Student s1, Student s2){
        if (s1.name == s2.name && s1.course == s2.course){
            System.out.println("Студенты одинаковы");
        } else {
            System.out.println("Студенты не одинаковы");
        }
    }

    public static void equalsStudents_2(Student s1, Student s2){
        if (s1.name == s2.name){
            if (s1.course == s2.course){
                System.out.println("Name's and Courses students одинаковы");
            } else {
                System.out.println("Course's students разные");
            }
        } else if (s1.course == s2.course){
            System.out.println("Name's students разные");
        } else {
            System.out.println("Name's and courses students разные");
        }
    }

    public static void equalsCombined(Student s1, Student s2){
        equalsStudents_1(s1, s2);
        equalsStudents_2(s1, s2);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Munir", 5);
        Student s2 = new Student("Andrey", 5);

        equalsCombined(s1, s2);


    }
}
