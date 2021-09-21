package JavaSE_1z0815.HomeWork.Lesson5;

public class Student {
    int num;
    String name, lastname;
    int year;
    int math, economic, english;
    double res;

    Student(String name1, int math1, int economic1, int english1){
        name = name1;
        math = math1;
        economic = economic1;
        english = english1;
        res = mean();
    }
    double mean(){
        double result = (double)(math + economic + english)/3;
        return result;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student a = new Student("Munir", 3,4,5);
        Student b = new Student("Andrey", 2,3,4);
        Student c = new Student("Tolya", 3,2,5);

        System.out.println(a.res);
        System.out.println(b.res);
        System.out.println(c.res);

    }
}
