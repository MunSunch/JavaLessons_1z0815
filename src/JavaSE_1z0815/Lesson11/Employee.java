package JavaSE_1z0815.Lesson11;

public class Employee {
    public double salary;
    Employee(double salary){
        this.salary = salary;
    }
    // Значения агрумента копируется в параметр метода
    public double multiple(double a){
        a = 100.0;
        return a;
    }
    public double multipleTrue(){
        salary *=2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(21.12);
        System.out.println(emp.salary);
        emp.multiple(emp.salary);
        System.out.println(emp.salary); //salary не изменилась
    }
}