package section8;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("첫 번째 숫자와 두 번째 숫자에 0을 입력하면 종료 됩니다.");
            System.out.print("첫 번째 숫자를 입력해주세요 : ");
            int a = sc.nextInt();

            System.out.print("두 번째 숫자를 입력해주세요 : ");
            int b = sc.nextInt();

            if ((a == 0) && (b == 0)){
                System.out.println("종료합니다.");
                break;
            }

            int sum = a + b;
            System.out.println("숫자의 합 : " + sum);

        }
    }
}
