package JavaSE_1z0815.Lesson4;

public class Student {
    int num;
    String name, lastname;
    int year;
    int math, economic, english;
    double res;

    Student(String name, int math, int economic, int english){
        this.res = (math+economic+english)/3;
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
