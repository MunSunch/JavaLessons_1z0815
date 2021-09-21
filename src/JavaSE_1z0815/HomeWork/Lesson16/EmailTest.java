package JavaSE_1z0815.HomeWork.Lesson16;

/*
   "ya@yahoo.com" ---> yahoo
   "on@mail.ru" ---> mail
   "ona@gmail.com" ---> gmail
*/

public class EmailTest {

//    private static int id = 1;
//    public static void email(String in){
//        String[] array = in.split(";");
//        for (String s: array) {
//            int start = s.indexOf('@') + 1;
//            int finish = s.indexOf('.');
//            System.out.println("№" + id++ + " пользуется почтой " + s.substring(start, finish));
//        }
//    }

    public static void email(String in){
        int start_char = 0, finish_char = 0;
        for (int i=0; i<in.length(); i++){
            boolean flag = false;
            if (in.charAt(i) == '@'){
                start_char = i+1;
            }
            if (in.charAt(i) == '.'){
                finish_char = i;
                flag = true;
            }
            if (flag){
                System.out.println(in.substring(start_char, finish_char));
            }
        }
    }

}
class GetEmail{
    public static void main(String[] args) {
        String in = "ya@yahoo.com;on@mail.ru;ona@gmail.com";
        EmailTest.email(in);

    }
}