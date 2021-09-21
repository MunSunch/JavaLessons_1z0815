package JavaSE_1z0815.Lesson15_While;

public class WhileTest {
    public static void main(String[] args) {

        //while
        int a = 1;
        int count=0;
        while (++a < 10){
            a++;
            count++; //1,2,3,4
        }
        System.out.println(count);

        //do-while
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}
