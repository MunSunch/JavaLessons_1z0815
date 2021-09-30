package JavaSE_1z0815.HomeWork.Lesson23;

public class Student {
    private StringBuilder name;
    private int course, grade;


    public Student(StringBuilder name, int course, int grade) {
        if (name.length() > 3 && course >= 1 && course <= 10 && grade >= 1 && grade <= 4) {
            this.name = name;
            this.course = course;
            this.grade = grade;
        }
    }
    public void showInfo(){
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс студента: " + getCourse());
        System.out.println("Оценка студента: " + getCourse());
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s = new Student(new StringBuilder("Andrey"), 5, 4);
        s.showInfo();
    }
}
