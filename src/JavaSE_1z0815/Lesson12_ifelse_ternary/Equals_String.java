package JavaSE_1z0815.Lesson12_ifelse_ternary;
// Сравнение объектов ссылочного типа данных
public class Equals_String {
    public static void main(String[] args) {
        String s1 = new String("Munir");
        String s2 = new String("Munir");
        System.out.print("Сравнение при помощи ==: ");
        System.out.println(s1==s2);
        System.out.println("Сравнение при помощи equals(): " + s1.equals(s2));
    }
}
