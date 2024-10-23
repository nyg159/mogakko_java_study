package section9;

public class Array2Ref1 {
    public static void main(String[] args) {
        // 3x3 2차원 배열 생성
        // 생성하는 배열의 크기만 변경하면 됨
        int[][] arr = new int[3][3];

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
