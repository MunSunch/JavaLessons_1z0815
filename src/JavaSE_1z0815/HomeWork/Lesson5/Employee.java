package JavaSE_1z0815.HomeWork.Lesson5;

public class Employee {

    int id, age, department;
    String surname;
    double salary;

    Employee(String surname1, double salary1){
        surname = surname1;
        salary = salary1;
    }

    void powerSalary(){
        salary*=2;
        info();
    }
    void info(){
        System.out.println(salary);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee Andrey = new Employee("Andrey", 100.21);
        Employee Tolya = new Employee("Tolya", 21.12);

        Andrey.powerSalary();
        Tolya.powerSalary();
    }
}
