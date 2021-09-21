package JavaSE_1z0815.Lesson17_StringBuilder;

//Дополнительные конструкторы String'a

public class String_create_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("str");
        StringBuffer sf = new StringBuffer("str");

        //Через StringBuilder
        String s1 = new String(sb);
        //Через StringBuffer
        String s2 = new String(sf);

        System.out.println("" + s1.equals(s2) + '\n' + s1);
    }
}
