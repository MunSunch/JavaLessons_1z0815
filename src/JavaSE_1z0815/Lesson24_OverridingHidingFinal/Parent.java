package JavaSE_1z0815.Lesson24_OverridingHidingFinal;

public class Parent {
    Object live(int a){
        Object o = new Object();
        return o;
    }
}

class Child extends Parent{
    //Return type такой же или
//    Object live(int a){
//        Object o = new Object();
//        return o;
//    }
    // или ковариантный, String is Object
    String live(int a){
        String o = new String();
        return o;
    }
}
