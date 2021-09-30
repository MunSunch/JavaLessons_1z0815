package JavaSE_1z0815.HomeWork.Lesson23;

public class Animal {
    int eyes;
    public Animal(){
        System.out.println("I am Animal");
    }

    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    String name;
    int tail = 1, paw = 4;
     public Pet(){
         super();
         System.out.println("I am Pet");
         this.eyes = 2;
     }
     public void run(){
         System.out.println("Pet runs");
     }
     public void jump(){
         System.out.println("Pet jumps");
     }
}

class Dog extends Pet{
    public Dog(String name) {
        super();
        this.name = name;
        System.out.println("I am dog and My name is " + name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
class Cat extends Pet {
    public Cat(String name){
        super();
        this.name = name;
        System.out.println("I am Cat and My name is " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog("Andrey");
        System.out.println(d.paw);
        Cat c = new Cat("Munir");
        c.sleep();
    }
}