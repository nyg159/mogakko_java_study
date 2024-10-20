package section7;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;   // int -> long
        System.out.println("longValue = " + longValue);  // longValue = 10

        doubleValue = intValue;  // int -> double
        System.out.println("doubleValue1 = " + doubleValue);  // doubleValue = 10.0

        doubleValue = 20L;  // long -> double
        System.out.println("doubleValue2 = " + doubleValue);  // doubleValue = 20.0

    }
}
