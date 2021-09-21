package JavaSE_1z0815.Lesson16_String;

// По умолчанию все классы из этого пакета по умолчанию уже импортируются, в их числе String
//import java.lang.*;

public class StringTest_Create {
    public static void main(String[] args) {

        // При помощи конструктора создается два объекта с одинаковым содержимым
        String s1 = new String("Munir");
        String s2 = new String("Munir");
        // Убедимся в этом, сравнив ссылки
        System.out.println(s1 == s2);

        // При помощи кавычек создадим два объекта с одинаковым содержимым
        String s3 = "Munir";
        String s4 = "Munir";
        // Первый объект попадает в string pool, затем выполняется поиск подобной строки в том же pool'е
        // Если нет, то создается новый. Если есть, то копируется ссылка на этот объект.
        // В нашем случае такой объект уже есть
        System.out.println(s3 == s4);

    }
}
