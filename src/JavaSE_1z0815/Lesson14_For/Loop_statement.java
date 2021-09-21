package JavaSE_1z0815.Lesson14_For;

public class Loop_statement {
    public static void main(String[] args) {

        for (int i = 1; i<=30; i++){
            if(i==21){
                System.out.println("Пропустили итерацию");
                continue;
            } else if (i==26) {
                break;
            } else {
                System.out.println(i);
            }
        }

    }
}
