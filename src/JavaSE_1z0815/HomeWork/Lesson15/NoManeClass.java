package JavaSE_1z0815.HomeWork.Lesson15;

public class NoManeClass {
    public static void printClock(){
        int hour = 0;
        OUTER:
        while(hour <= 6){
            int minute = -1;

            MIDDLE:
            do{
                minute++;
                if(hour>1 && minute % 10 == 0){
                    break OUTER;
                }
                int second = 0;

                INNER:
                while(second<60){
                    if (second*hour > minute){
                        continue MIDDLE;
                    } else {
                        System.out.println(hour + ":" + minute + ":" + second);
                    }
                    second++;
                }
            } while (minute<59);
            hour++;
        }
    }

    public static void main(String[] args) {
        printClock();
    }
}
