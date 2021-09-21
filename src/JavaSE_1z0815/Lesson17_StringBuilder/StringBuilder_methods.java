package JavaSE_1z0815.Lesson17_StringBuilder;

/*
    length() -> int
    charAt(int index) -> char
    indexOf(String s), indexOf(String s, int start_index) -> int
    substring(int beginIndex), substring(int beginIndex, int endIndex) -> String
    subSequence(int beginIndex), subSequence(int beginIndex, int endIndex) -> CharSequence
    append(datatype d) -> StringBuilder
    reverse() -> StringBuilder
    insert(int index, String s) -> StringBuilder
    delete(int beginIndex, int Index) -> StringBuilder
    deleteCharAt(int index) -> StringBuilder
    replace(int beginIndex, int index, String s) -> StringBuilder
    capacity() -> int
*/

public class StringBuilder_methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sunchalyaev");

        //Длина строки
        int length = sb.length();
        System.out.println("Длина " + length + '\n' + "Вместимость = " + length + " + 16 = " + sb.capacity());

        //Возврат символа по индексу
        char c1 = sb.charAt(4);
        System.out.println("Символ с индексом 4 - это " + c1);

        //Извлечение подстроки
        String s1 = sb.substring(2, 5);
        CharSequence cs1 = sb.subSequence(2, 5);
        System.out.println(s1 + '\t' + cs1);

        //Добавление элементов любых
        sb.append("String").append(12).append(new StringBuilder_methods());
        System.out.println("Добавление элементов: " + sb);

        //Вставка
        sb.insert(5, "HELLO");
        System.out.println("Вставка элементов: " + sb);

        //Удаление элементов
        sb.delete(16, sb.length()).delete(5, 10). deleteCharAt(7);
        System.out.println("Удаление элементов: " + sb);

        //Reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);

        //Замена элементов*
        sb.reverse().replace(3, 6, "Munir"); //* сам endIndex не учитывается, т.е. будет 3, 4, 5
        System.out.println("После замены: " + sb);

        //Capacity
        int c = sb.capacity();
        System.out.println("Вместимость: " + c + '\n');

    }
}
