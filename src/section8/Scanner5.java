package section8;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료됩니다.): ");
            int num = sc.nextInt();

            sum += num;
            
            if (num == 0) {
                System.out.println("모두 합친 값은 : " + sum);
                break;
            }
        }
    }
}
