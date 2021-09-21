package JavaSE_1z0815.Lesson10;
// Получим доступ к классу S из подпакета SubPackage пакета Chapter6 Homework
import JavaSE_1z0815.HomeWork.Lesson6.SubPackage.S;

public class SubPackage {
    public static void main(String[] args) {
        S s = new S();
        JavaSE_1z0815.HomeWork.Lesson6.SubPackage.S_non s_non = new JavaSE_1z0815.HomeWork.Lesson6.SubPackage.S_non();
    }
}
