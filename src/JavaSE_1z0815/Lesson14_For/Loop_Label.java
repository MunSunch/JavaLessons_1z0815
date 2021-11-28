package JavaSE_1z0815.Lesson14_For;

import static JavaSE_1z0815.Тестовый.Print.print;

public class Loop_Label {
    public static void main(String[] args) {

        OUTER:
        for(;;){
            MIDDLE:
            for(int i=0;;i++){
                INNER:
                for(int j=2;; j+=2){
                    print(i, j);
                    if(i+j>21){
                        break OUTER;
                    }
                    if(i%2!=0){
                        continue MIDDLE;
                    }
                }
            }
        }



    }
}
