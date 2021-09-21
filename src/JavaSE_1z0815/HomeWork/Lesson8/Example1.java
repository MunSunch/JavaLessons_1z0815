package JavaSE_1z0815.HomeWork.Lesson8;

public class Example1 {
    public static int multipleThree(int n1, int n2, int n3){
        return n1*n2*n3;
    }
    public static void multipleThree(int n1, int n2){
        System.out.println(n1/n2 + " " +  n1%n2);
    }
}

class Example1Test{
    public static void main(String[] args) {
        int res = Example1.multipleThree(3,3,5);
        System.out.println(res);
        Example1.multipleThree(5,3);
    }
}
