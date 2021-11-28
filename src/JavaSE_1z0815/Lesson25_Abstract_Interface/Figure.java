package JavaSE_1z0815.Lesson25_Abstract_Interface;

public abstract class Figure {
    int countSides;
    abstract void S();
    abstract void P();
    void show(){
        S();
        P();
    }
    Figure(int countSides){
        this.countSides = countSides;
    }
}

class Square extends Figure{
    final int a;
    Square(int a){
        super(4);
        this.a = a;
    }
    void S(){
        System.out.println(a*a);
    }
    void P(){
        System.out.println(4*a);
    }
}

class TestFigure{
    public static void main(String[] args) {
        Figure f = new Square(4);
        System.out.println(f.countSides);
    }
}
