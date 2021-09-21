package JavaSE_1z0815.Lesson13_Swicth;

public class Switch_statement {
    public static void main(String[] args) {
        int res = 1;
        switch (res){
            case 1:
                System.out.println(1);
//                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("null");
        }

        String today = "Сб";
        switch (today){
            case "Пн":
            case "Вт":
            case "Ср":
            case "Чт":
            case "Пт":
                System.out.println("Рабочий день");
                break;
            case "Сб":
            case "Вс":
                System.out.println("Выходной день");
        }
    }
}
