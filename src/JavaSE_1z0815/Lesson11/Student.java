package JavaSE_1z0815.Lesson11;

public class Student {
    public String name;
    public int course;
    public Student(String name) {
        this(name, 0);
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // В s1 копируется ссылка подаваемого на вход аргумента. Далее, в соответствие со своим scope'ом s_copy уничтожается
    public static void swap(Student s_copy){
        Student s2 = new Student("Munir");
        s_copy = s2;
    }
    // В s2 скопируется ссылка на объект s. Таким образом, name изменится(смотри Paint)
    public static void swap_name(Student s2){
        s2.name = "Tolya";
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s = new Student("Andrey");
        Student.swap(s);
        System.out.println(s.name);

        Student.swap_name(s);
        System.out.println(s.name);
    }
}