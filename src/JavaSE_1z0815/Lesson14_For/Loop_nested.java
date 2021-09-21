package JavaSE_1z0815.Lesson14_For;

public class Loop_nested {
    public static void main(String[] args) {

        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            INNER:
            for (int minute = 0; minute <= 60; minute++) {
                if (minute==30){
                    continue OUTER;
                } else {
                    System.out.println(hour + ":" + minute);
                }
            }
        }
    }
}
