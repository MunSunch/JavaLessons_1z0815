package JavaSE_1z0815.Lesson14_For;

public class Loop_for {
    public static void main(String[] args) {
        boolean condition = false;
        for(int start = 1; start<=10; start++){
            System.out.println("start ---> "+start);
            condition = start<=10;
            System.out.println(start+" <= 10" + "---> " + condition);
            System.out.println("start++ ---> "+start);
            System.out.println("---------------------------------------");
        }
    }
}
