package JavaSE_1z0815.Lesson12_ifelse_ternary;

public class Test {
    public static void main(String[] args) {
        int a = 12;
        // Фигурные скобки не указаны, значит выполнится/невыполнится только первая строка
        if (a<20)
            System.out.println("Я принадлежу к if");
//            System.out.println("Я не принадлежу к if"); // выполнится независимо от результата a>20
        else {
            System.out.println(true);
            System.out.println("Не принадлежу else");
        }

        // Пример с вложенным if-else
        int b = 13;
        if(b<12){
            if(b==11){
                System.out.println("b = 11");
            }
        } else if (b>12){
            if (b==12){
                System.out.println("b = 12");
            }
            else{
                System.out.println("b != 12");
            }
        }

        boolean c = false;
        if (c=true){}
    }
}
