package section7;

public class Scope3_3_for {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++){
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
