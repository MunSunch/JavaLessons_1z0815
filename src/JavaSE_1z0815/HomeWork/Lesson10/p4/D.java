package JavaSE_1z0815.HomeWork.Lesson10.p4;

import JavaSE_1z0815.HomeWork.Lesson10.A;
import JavaSE_1z0815.HomeWork.Lesson10.p2.p3.C;
import JavaSE_1z0815.HomeWork.Lesson10.p4.p5.E;
import static JavaSE_1z0815.HomeWork.Lesson10.p2.B.*;

public class D {
    int countD = (new A()).countA;
    String strD = (new C()).methodC();
    D(){
        new E();
    }

//    void methodB(){
//        System.out.println("method in class D");
//    }
    void methodD(){
        methodB();
    }

    String name = "aaaa";
    void returnNameB(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.countD);
        System.out.println(d.strD);

        d.methodD();

        /* При вызове будет искать name в классе, если не найдет, то воспользуется импортом
        *  Закомментируй instance var "name", чтобы в этом убедиться
        *  Или раскомментируй methodB() */
        d.returnNameB();
    }
}


