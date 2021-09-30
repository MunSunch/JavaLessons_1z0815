package JavaSE_1z0815.Тестовый;

import JavaSE_1z0815.Lesson23_ООП.People;

public class Employee extends People {
    public static void main(String[] args) {
        Employee e = new Employee();
//        System.out.println(e.getName());
        // Не наследуется, так как getName() имеет default access modifier и виден только в пакете родителя
        e.print();
        //print() имеет access modifier protected и прописан в наследнике, поэтому доступен в наследнике
    }
}
class Test{
    public static void main(String[] args) {
        Test e = new Test();
//        e.print();
    }
}
