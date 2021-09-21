package JavaSE_1z0815.HomeWork.Lesson17;

public class Test {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        if (sb1 != null && sb2 != null && sb1.length()==sb2.length()){
            return (new String(sb1)).equals(new String(sb2));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("g");
        StringBuilder sb2 = new StringBuilder("g");
        boolean b = ravenstvo(sb1, sb2);
        System.out.println(b);
    }
}
