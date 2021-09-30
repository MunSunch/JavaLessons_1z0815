package JavaSE_1z0815.Lesson23_ООП;

//Пример инкапсулированного класса
public class Human {
    private String name;
    private int age;
    private final char sex;

    public Human(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

class Human_final{
    private StringBuilder name;

    public Human_final(StringBuilder name) {
        this.name = name;
    }
//    Написан неверно, перепишем его
//    Геттер должен только возвращать объект, не изменять его
//    public StringBuilder getName() {
//        return name;
//    }

    public StringBuilder getName() {
        StringBuilder sb = name;
        return sb;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Human_final h = new Human_final(new StringBuilder("Andrey"));
        System.out.println("Имя = " + h.getName());

        h.getName().append("1111");
        System.out.println("Имя = " + h.getName());

    }
}
