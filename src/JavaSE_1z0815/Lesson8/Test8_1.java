package JavaSE_1z0815.Lesson8;

public class Test8_1 {
    // final variable инициализируется при объявлении
    public final int i;
    // или в конструкторе, если variable не static
    Test8_1(){
        i=11;
    }
    // final параметр
    public void abc(final int a){
//        a++;
    }
    public static void main(String[] args) {
        Test8_1 t = new Test8_1();
        System.out.println(t.i);
    }
}
