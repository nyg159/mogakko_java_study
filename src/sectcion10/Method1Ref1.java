package sectcion10;

public class Method1Ref1 {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(15,10);
        System.out.println("결과1 출력 : " + sum1);

        //계산 2
        int sum2 = add(10,20);
        System.out.println("결과2 출력 : " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
