package JavaSE_1z0815.Lesson2_PrimitiveTypes_Literals_Underscore;

public class DZ {
    public static void main(String[] args) {
        //Задание 1
        byte b_10 = 12;
        byte b_2 = 0b1100;
        byte b_8 = 0_14;
        byte b_16 = 0xC;
        System.out.println(b_10+" "+b_2+" "+b_8+" "+b_16);

        short s_10 = 1300;
        short s_2 = 0b101_0001_0100;
        short s_8 = 0_2424;
        short s_16 = 0X514;
        System.out.println(s_10+" "+s_2+" "+s_8+" "+s_16);

        int i_10 = 0;
        int i_2 = 0B0;
        int i_8 = 0_0;
        int i_16 = 0X0;
        System.out.println(i_10+" "+i_2+" "+i_8+" "+i_16);

        long l_10 = 123_456_789;
        long l_2 = 0b0111_0101_1011_1100_1101_0001_0101;
        long l_8 = 0_726_746_425;
        long l_16 = 0x75B_CD15;
        System.out.println(l_10+" "+l_2+" "+l_8+" "+l_16);

        //Задание 2
        float f1 = 3.1415F;
        float f2 = 2.71F;
        double d1 = 3.14;
        double d2 = 2.71;
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(f1+" "+f2+" "+d1+" "+d2+" "+b1+" "+b2);

        //Задание 3
        char c1 = '*';
        char c2 = 101;
        char c3 = '\u0101';
        System.out.println(c1+" "+c2+" "+c3);

    }
}
