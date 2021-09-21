package JavaSE_1z0815.Lesson15_While;

public class Unreachable_statement {
    public static void main(String[] args) {

        //      #1
//        while(5<1);
//        while(false);

        //      #2 все норм
        do{
            System.out.println(1);
        } while(false);


    }
}
