package JavaSE_1z0815.Lesson20_ArrayList;
import java.util.ArrayList;

public class ArrayList_create {
    public static void main(String[] args) {
        // Элементами Arraylist'a могут быть любые классы
        ArrayList array = new ArrayList();
        array.add("ok");
        array.add(new ArrayList_create());
        array.add(new Car());

        // Чаще используют один тип данных
        // В этом случае употребляются скобки, для указания компилятору
        ArrayList <String> array2 = new ArrayList<>();
        array2.add("fdf");
//        array2.add(new StringBuilder("wff")); // лист2 принимает только string объекты
    }
}
class Car{}