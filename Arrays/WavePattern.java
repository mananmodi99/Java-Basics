package Arrays;

public class WavePattern {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        int top = 0, bottom = arr.length-1, left = 0, right = arr[top].length-1, dir = 1;
        while(left<=right && top<=bottom){
            if(dir==1){
                for(int i =left; i<=right; i++){
                    System.out.println(arr[top][i]);
                }
                top++;
                dir++;
            }
            if(dir==2){
                for(int i=right; i>=left; i--){
                    System.out.println(arr[top][i]);
                }
                top++;
                dir--;
            }
        }
    }
}
