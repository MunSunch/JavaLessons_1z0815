package JavaSE_1z0815.Lesson8;

public class StaticElements {
    int count1;
    static int count2;

    // Non-static method call in static method вызывет ошибку, которую можно обойти
    // Создать внутри метода экземпляр класса.
    public static void abcd(){
//        abc(); //CompileError
        StaticElements s=new StaticElements();
        s.abc();
    }
    // Внутри non-static method вызов static method'а не вызывает ошибок.
    public void abc(){
        abcd();
    }
}
