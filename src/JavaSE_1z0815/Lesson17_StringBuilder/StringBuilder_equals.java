package JavaSE_1z0815.Lesson17_StringBuilder;

public class StringBuilder_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        //Equals() в классе не перезаписан, поэтому эквивалентен оператору ==
        System.out.println(sb1.equals(sb2));
    }
}
