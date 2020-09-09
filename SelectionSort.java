import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {-3, 5, -5, 10, 6};
        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        //Selection Sort
        for(int i = 0;i<n-1; i++){

            int minIndex = i;
            for(int j=i; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }}
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        for (int item: arr) {
            System.out.print(item+ " ");
        }
    }
}
