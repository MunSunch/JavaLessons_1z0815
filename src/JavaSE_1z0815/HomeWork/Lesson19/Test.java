package JavaSE_1z0815.HomeWork.Lesson19;
//Компилировать вручную

import java.util.Arrays;

public class Test {
    public static String[] abc(String[]... array_in) {
        int length = 0;
        for (String[] s : array_in) {
            length += s.length;
        }
        String[] array_out = new String[length];
        int i = 0;
        for (String[] s : array_in) {
            for (String str : s) {
                array_out[i] = str;
                i++;
            }
        }
        return array_out;
    }

    public static void main(String[] args) {
        String[] s = abc(new String[]{"pl", "dw", "saasa"}, new String[]{"ffs", "xvx", "ewq"});
        for (int index = 0; index < s.length; index++) {
            for (String arg : args) {
                if(arg.equals(s[index])) {
                    s[index] = null;
                }
            }
        }

        System.out.println(Arrays.toString(s));
    }
}
