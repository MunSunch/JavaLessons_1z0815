package JavaSE_1z0815.Lesson14_For;

public class UnreachableStatement {
    public static void main(String[] args) {

        if (false) {
        }

//        for(;false;){}

        // loop for будет относиться к первому statement'у
        int a = 5;
        if (a > 10) for (int i = 1; i <= 5; i++)
            a++;
        System.out.println(a);
    }
}
