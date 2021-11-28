package JavaSE_1z0815.Lesson7; //package statement

public class Test7_1 {
    public static void main(String[] args) {
        A a = new A();
        // Так как Employee находится в другом package, прописываем полный путь и ставим public class Employee
        JavaSE_1z0815.Lesson6_Overloaded.Employee e = new JavaSE_1z0815.Lesson6_Overloaded.Employee(5, "frasasawq");

    }
}
