package JavaSE_1z0815.HomeWork.Lesson6;

public class Summa {
    int summa(){
        return 0;
    }
    int summa(int a){
        return summa() + a;
    }
    int summa(int a1, int b1){
        return summa(a1) + summa(b1);
    }
    int summa(int a2, int b2, int c2){
        return summa(a2, b2) + summa(c2);
    }
    int summa(int a3, int b3, int c3, int d3){
        return summa(a3, b3, c3) + summa(d3);
    }
}
class SummaTest{
    public static void main(String[] args) {
        Summa s = new Summa();
        int res = s.summa();
        System.out.println(res);
        res = s.summa(3);
        System.out.println(res);
        res = s.summa(3,5);
        System.out.println(res);
        res = s.summa(3, 11, 12);
        System.out.println(res);
        res = s.summa(3, 10,11,21);
        System.out.println();
    }
}
