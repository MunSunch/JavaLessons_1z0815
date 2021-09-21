package JavaSE_1z0815.Lesson17_StringBuilder;

public class StringBuilder_create {
    public static void main(String[] args) {
        //1)
        StringBuilder sb1 = new StringBuilder();
        //2)
        StringBuilder sb2 = new StringBuilder("Good day!"); // capacity = "Good day".length() + 16 = 9 + 16 = 25
        //3)
        StringBuilder sb3 = new StringBuilder(23);
        //4)
        StringBuilder sb4 = new StringBuilder(sb2);
    }
}
