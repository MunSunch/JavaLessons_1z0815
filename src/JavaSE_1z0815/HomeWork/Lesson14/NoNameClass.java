package JavaSE_1z0815.HomeWork.Lesson14;

public class NoNameClass {
    public static void printClock() {

        OUTER:
        for (int hour = 0; hour <= 6; hour++) {

            INNER:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                INNER_TO_INNER:
                for (int second = 0; second < 60; second++) {
                    if (second*hour > minute){
                        continue INNER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        printClock();
    }
}
