package section7;

public class Scope3_3_while {

    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }

    }
}
