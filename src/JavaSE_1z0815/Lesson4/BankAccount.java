package JavaSE_1z0815.Lesson4;

public class BankAccount {
    int id; //0
    String name; //null
    double balance; //0.0
    boolean force_major; //false
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        //тип данных bA = конструктор

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.name = "Munir";
        YourAccount.name = "Andrey";

        System.out.println(MyAccount.name);
        System.out.println(YourAccount.name);
        System.out.println(HisAccount.name);
    }
}