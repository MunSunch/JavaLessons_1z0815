package JavaSE_1z0815.HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static ArrayList<String> abc(String ... in){
        ArrayList<String> array = new ArrayList<>();
        for(String s: in){
            int count=0;
            for(String ss: in){
                if (ss.equals(s)){
                    count++;
                }
                if (count>1){
                    break;
                }
            }
            if (count == 1){
                array.add(s);
            }
        }
        Collections.sort(array);
        return array;
    }
}
class TestTest{
    public static void main(String[] args) {
//        ArrayList<String> array = Test.abc("ok", "hello", "thank", "goodbye", "ok", "thank", "telephone", "hellboy");
//        System.out.println(array);

    }
}
