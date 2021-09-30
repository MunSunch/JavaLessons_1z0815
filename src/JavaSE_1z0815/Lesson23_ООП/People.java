package JavaSE_1z0815.Lesson23_ООП;

public class People {
    private String name="Tolya";
    public void setName(String name){
        this.name = name;
    }
     String getName(){
        return name;
    }
    protected void print(){
        System.out.println("...");
    }
}
