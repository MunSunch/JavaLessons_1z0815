package JavaSE_1z0815.Тестовый;

public class Print {
    public static void print(String s){
        System.out.println(s);
    }
    public static void print(char c){
        System.out.println(c);
    }
    public static void print(int c){
        System.out.println(c);
    }
    public static void print(int...c){
        for(int i: c){
            System.out.print(i+'\t');
        }
    }
}
