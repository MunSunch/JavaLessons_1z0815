package JavaSE_1z0815.Lesson2_PrimitiveTypes_Literals_Underscore;

public class Test1 {
    public static void main(String[] args) {

        double d = 10_000_000_000_000L; //double вмещает в себя long
//        long l2 = 3.14;
        System.out.println(d);
        long l = 10_000_000_000L;
        float f = 3.1_4f;

//        char c = 'A'; 
//        char c = 303; //Символ из Юникода, указанный в десятичной СС
        char c = '\u0AAB'; //Символ из Юникода, указанный в шестнадцатиричной СС
        System.out.println(c);

        var v = 12;
        var v2 = 12.12;
        var v3 = 'a';
        var v4 = false;
        var v5 = "a";


        int i = 2_1;
        i=0b1_0101;
        i=0_25;
        i=0x1_5;
        System.out.println(i); // При выводе число будет конвертироваться в десятичную СС

    }
}
