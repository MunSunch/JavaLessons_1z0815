package JavaSE_1z0815.Lesson14_For;

// Требуется написать программу, которая выводит все четные числа от 1 до 30
public class Test {
    public static void main(String[] args) {

//        for(int i=1; i<=30; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

//        for (int i = 2; i <= 30; i += 2) {
//            System.out.println(i);
//        }

        for (int hour = 0; hour<24; hour++){
            for (int minute = 0; minute<=60; minute++){
                System.out.println(hour + ":" + minute);
            }
        }
    }
}
