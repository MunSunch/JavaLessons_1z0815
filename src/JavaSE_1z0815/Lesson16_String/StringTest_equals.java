package JavaSE_1z0815.Lesson16_String;

public class StringTest_equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.trim();
        // В результате trim() выдаст тот же самый неизмененный объект
        System.out.println(s1 == s2);

        // Для сравнения строк между собой без учета регистра
        String s4 = s1.toUpperCase();
        System.out.println("s1.equals(s4) ---> " + s1.equals(s4) + " с учётом регистра");
        System.out.println("s1.equalsIgnoreCase(s4) ---> " + s1.equalsIgnoreCase(s4) + " без учёта регистра");


    }
}
