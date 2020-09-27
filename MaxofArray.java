import java.util.Scanner;

public class MaxofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println("Size ?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for (int val:arr) {
            if (val > max)
                max = val;
        }
        System.out.println(max);
    }
}
