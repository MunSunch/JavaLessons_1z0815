package JavaSE_1z0815.Lesson14_For;

public class Loop_for_property {
    public static void main(String[] args) {

//        // 1
//        int i = 1;
//        for (; i<=5; i++){}
//
//        //2
//        int a;
//        for (a=3; a<6; a++){}
//
//        //3(Compile error)
//        for(int i_local = 0; i<2; i++){}
////        int local = i_local;
//
//        //4
//        for (int s=1, b=s++, c=s++; c<11; s++){}
//
//        //5
//        for(int b = 1, f = 2; ;b++){}
//
//        //6, 7
//        for(int e=1, d=2; e<d & d>e; e++){}

          // 8,9,10
        for (int i = 1; i<5; printerNum(i)){
            System.out.println(i);
            i++;
        }
        int i = 1;
        for(; i <5; i++){}
    }
    static void printerNum(int num){
        System.out.println("print " + num);
    }
}
