package JavaSE_1z0815.Lesson15_While;

public class ClockTest {
    public static void main(String[] args) {
        int hour = -1;

        OUTER:
        do{
            hour++;
            int minute = 0;
            INNER:
            while(minute<60){
                if (minute == 30){
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
        } while (hour<24);
    }
}
