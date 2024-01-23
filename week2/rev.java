
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        int n, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        n = sc.nextInt();
        int arr[], arr1[];
        arr = new int[n];
        arr1 = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            j = sc.nextInt();
            arr[i] = j;
        }

       int[] temp = arr.clone();

        for (int i = 0; i < n; i++) {
            // Reverse the number
            int reversedNum = 0;
            while (temp[i] != 0) {
                int digit = temp[i] % 10;
                reversedNum = reversedNum * 10 + digit;
                temp[i] = temp[i] / 10;
            }
            arr1[i] = reversedNum;
        }

        System.out.println("Original\tReversed ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t" + arr1[i]);
        }
    }
}
