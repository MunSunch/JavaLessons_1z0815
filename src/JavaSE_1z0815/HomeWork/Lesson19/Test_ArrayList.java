package JavaSE_1z0815.HomeWork.Lesson19;

import java.util.ArrayList;

public class Test_ArrayList {
    public static ArrayList<String> abc(String[]... array_in) {
        ArrayList <String> array_out = new ArrayList<>();
        for (String[] s : array_in) {
            for (String str : s) {
                array_out.add(str);
            }
        }
        return array_out;
    }
}
