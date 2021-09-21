package JavaSE_1z0815.Lesson16_String;

/*
    length() -> int
    charAt(int index_char) -> char
    indexOf(char/String s) -> int
    indexOf(char/String s, int index) -> int
    trim() -> String
    startsWith(String s, int index) -> boolean
    endsWith(String s, int index) -> boolean
    substring(int index_start, int index_finish) -> String
    contains(String s) -> boolean
    replace(char/String s_replace, char/String s) -> String
    toLowerCase(), toUpperCase() -> String
    concat() -> String
 */

public class StringTest_Methods {
    public static void main(String[] args) {

        String s = "Sunchalyaev";

        //Длина строки
        int i1 = s.length();
        System.out.println("Длина строки: " + i1);

        //Вернуть символ по индексу
        char c1 = s.charAt(4);
        System.out.println("Символ с индексом 4 - " + c1);

        //Вернуть индекс символа по символу
        int i2 = s.indexOf('a');
        System.out.println("Индекс символа a - " + i2);
        int i3 = s.indexOf("ha");
        System.out.println("Индекс подстроки ha - " + i3);
        int i4 = s.indexOf("a", 6);
        System.out.println("Индекс символа a, начиная с 6 индекса - " + i4);

        //Возвращает истину, если строка начинается с входной подстроки
        boolean b1 = s.startsWith("Sun");
        System.out.println("Строка начинается с подстроки Sun? " + b1);
        boolean b2 = s.startsWith("ly", 4);
        System.out.println("Подстрока[4:] строки начинается с подстроки ly? " + b2);

        //Возвращает истину, если строка заканчивается с входной подстроки
        boolean b3 = s.endsWith("ev");
        System.out.println("Строка заканчивается подстрокой ev? " + b1);

        //Извлекает из строки подстроку, определенную с некоторого начального индекса и конечного(его не включая).
        String s1 = s.substring(3, 6); // 3, 4, 5 индексы
        System.out.println("Извлечённая подстрока: " + s1);

        //Убирает пробелы до и после строки
        s = "           a s d f        ";
        System.out.println("Удалили все пробелы: до и после" + '\n' + s.trim());

        //Замена символа/подстроки на символ/подстроку
        s = "Sunchalyaev";
//        String s2 = s.replace('a', 'A');
//        System.out.println("Изменённая строка: " + s2);
//        String s3 = s.replace("un", "m");
//        System.out.println("Изменённая строка: " + s3);
        // Если символы одинаковы, то
        String s4 = s.replace('a', 'a');
        System.out.println(s4 == s);

        //Объединение строк
        System.out.println(s.concat(" OK"));
        System.out.println( "" + 12 + false);
//        System.out.println(true + 11);
        // По правилам арифметики первое действие - это 5 + true, т.е. int+boolean
//        String s_noName = 5 + true + "";

        // Изменение регистра
        System.out.println("HYGY".toLowerCase());
        System.out.println("HYGY".toLowerCase().toUpperCase());

        // Существует ли заданная подстрока в строке
        boolean b = s.contains("ch");
        System.out.println("Есть ли ch в строке? " + b);

    }
}
