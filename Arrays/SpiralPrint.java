package Arrays;
#Create a Package Array before Running
public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        int top = 0, bottom = arr.length-1, left = 0, right = arr[top].length-1, dir=1, count = (bottom+1)*(right+1);
        if(count>0){
            while (left<=right && top<=bottom){
                        if(dir==1) {
                            for (int i = left; i <= right; i++) {
                                System.out.println(arr[top][i]);
                                count--;
                            }
                            dir++;
                            top++;
                        }

                        if(dir==2){
                            for(int i=top; i<=bottom; i++){
                                System.out.println(arr[i][right]);
                                count--;
                            }
                            dir++;
                            right--;
                        }
                        if(dir==3){
                            for (int i=right; i>=left; i--){
                                System.out.println(arr[bottom][i]);
                                count--;
                            }
                            dir++;
                            bottom--;
                        }
                        if (dir==4){
                            for (int i = bottom; i>=top; i--){
                                System.out.println(arr[i][left]);
                                count--;
                            }
                            dir = 1;
                            left++;
                        }
                }
            }
   }
}
