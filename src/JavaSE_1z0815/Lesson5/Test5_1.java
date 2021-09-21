package JavaSE_1z0815.Lesson5;

public class Test5_1 {
    // Return type int + nested show()
    int summa(int a, int b, int c){
        int res = a+b+c;
        show(); // для продолжения show() должен выполниться
        return res;
//        res++;   // Unreachable statement
    }
    void show(){
        System.out.println("It's void method");
    }
    public static void main(String[] args) {
        Test5_1 t = new Test5_1();
        int result = t.summa(4,5,6);
        System.out.println(result);
        t.show();
    }
}
