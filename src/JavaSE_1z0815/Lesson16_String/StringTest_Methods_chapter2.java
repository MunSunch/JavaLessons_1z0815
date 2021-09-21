package JavaSE_1z0815.Lesson16_String;

/*
    isEmpty() -> boolean
    isBlank() -> boolean
    strip, stripLeading, stripTrailing -> String
*/

public class StringTest_Methods_chapter2 {
    public static void main(String[] args) {
        String s_0Length = "";
        String s_ = "    ";

        //Если s.length()==0, true
        boolean b1 = s_0Length.isEmpty();
        System.out.println("Пустая строка? " + b1);

        //Если в строке только пробелы, то true
        boolean b2 = s_.isBlank();
        System.out.println("Строка полностью состоит из пробелов? " + b2);

        //Удаляет пробелы до и после. Подобен методу trim(), но намного лучше его
        String s_strip = " , ";
        System.out.println("Удалились пробелы до и после:" + s_strip.strip() + "_");
        System.out.println("Удалились пробелы до:" + s_strip.stripLeading() + "_");
        System.out.println("Удалились пробелы после:" + s_strip.stripTrailing() + "_");

    }
}
