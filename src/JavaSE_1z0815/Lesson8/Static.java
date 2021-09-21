package JavaSE_1z0815.Lesson8;

public class Static {
    private String name;
    static int id;

    Static(String name1) {
        name = name1;
        id++;
    }
    public static void printerHello(){
        System.out.println("Hello");
    }

    //    Если точка входа находится в классе, то доступ к static var
//    может осуществляться без указания класса
    public static void main(String[] args) {
        System.out.println(id);
        printerHello();
    }
}

class StaticTest {
    //    public static void main(String[] args) {
//        Static s1=new Static("Andrey");
//        Static s2=new Static("Munir");
//        Static s3=new Static("Tolya");
//
////      Обращение к static var через класс
//        System.out.println(Static.id);
////      Обращение к static var через экземпляр класса не вызывает ошибок
//        System.out.println(s2.id);
//    }
//    public static void main(String[] args) {
////        Обращение к static var без создания instance class.
//        System.out.println(Static.id);
//
}

