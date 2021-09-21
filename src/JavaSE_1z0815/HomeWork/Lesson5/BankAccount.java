package JavaSE_1z0815.HomeWork.Lesson5;

public class BankAccount {
    double balance;
    void rep(double a){
        balance+=a;
        info_balance();
    }
    void tak(double a){
        balance-=a;
        info_balance();
    }
    BankAccount(double balance1){
        balance = balance1;
    }
    void info_balance(){
        System.out.println(balance);
    }
}

class BankTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount(12.3);
        bA.rep(17.7);
    }
}
