package JavaSE_1z0815.Lesson3;

public class Test3_1 {
    public static void main(String[] args) {
        int x=5, y=5;
        int res = --x + y++ - x--;
//        System.out.println(res+" "+x);

        int a=10, b=11, c=12;
        a=b=c=18;
//        System.out.println(a+b+c);

        long i = 100;
        float f = i;  // Такое возможно, так как float имеет большую размерность

        // Short circuit
        boolean result = a>b && c++==(c+1); // false && true = false (short circuit)
        System.out.println(result);
        System.out.println("c = "+c); // с не изменился, так как правый операнд не вычислялся

        // Повторим, применяя полную схему
        boolean result2 = a>b & c++==(c+1); // false && true = false
        System.out.println(result);
        System.out.println("c = "+c); // с изменился, так как правый операнд вычислился, несмотря на false левого операнда

        a=b=c=18;
        // Проделаем то же самое, только с ||
        boolean result3 = a==b || c++==(c+1); // true || true = true (short circuit)
        System.out.println(result3);
        System.out.println("c = "+c); // с не изменился, так как правый операнд не вычислялся

        // Повторим, применяя полную схему
        boolean result4 = a==b | c++==(c+1); // true | true = true
        System.out.println(result4);
        System.out.println("c = "+c); // с изменился, так как правый операнд вычислился, несмотря на false левого операнда

        // Побитовая конъюкция и дизъюнкция
        int t = 12, d = 21;
        System.out.println("12&21 = "+(t&d));
        System.out.println("12|21 = "+(t|d));


    }
}
