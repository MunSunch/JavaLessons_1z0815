package JavaSE_1z0815.HomeWork.Lesson13;

public class Month {
    public byte getCountDaysMonth(int Month){
        byte DaysMonth;
        switch (Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DaysMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DaysMonth = 30;
                break;
            case 2:
                DaysMonth = 28;
                break;
            default:
                DaysMonth = 0;
        }
        return DaysMonth;
    }

    /** Возвращает количество дней в месяце, указанном цифрой в диапазоне 1-12
     *  Календарь 2021 года:
     *      31 - Январь(1), Март(3), Май(5), Июль(7), Август(8), Октябрь(10), Декабрь(12)
     *      30 - Апрель(4), Июнь(6), Сентябрь(9), Ноябрь(11)
     *      28 - Февраль(2)
     */
    public static byte getDays(final int numMonth){
        Month month = new Month();
        return month.getCountDaysMonth(numMonth);
    }
}

class MonthTest{
    public static void main(String[] args) {
        System.out.println(Month.getDays('a'));
    }
}
