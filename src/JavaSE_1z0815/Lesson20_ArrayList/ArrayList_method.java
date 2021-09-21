package JavaSE_1z0815.Lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_method {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //Добавить на позицию с таким то индексом, по умолчанию на последнюю
        array.add("sdsd");
        array.add("ewv");
        array.add(1, "ok");
        System.out.println(array.toString());

        //Получить элемент по индексу
        for (int i = 0; i < array.size(); i++)
//            System.out.println(array.get(i));

        //Удалить элемент по индексу либо по объекту
        array.remove("sdsd");
        System.out.println(array.toString());
        /* Remove проходит по всем элемента массива и сравнивает их с инпут обьектом методом equals()
        (который не у каждого обьекта определен). И поэтому даже если их содержимое одинаково, remove
        может ничего не удалить */
        ArrayList <StringBuilder> ar_sb = new ArrayList<>();
        ar_sb.add(new StringBuilder("fdrea"));
        ar_sb.remove(new StringBuilder("fdrea")); //sb1.equals(sb2) = sb1==sb2 ---> false
        System.out.println(ar_sb.toString());

        System.out.println("Git");
    }

}
