package section8;

import java.util.Objects;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력해주세요 (exit 입력시 종료) : ");
            String str = sc.nextLine();
            if (Objects.equals(str, "exit")) {
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
