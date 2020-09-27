import java.util.Scanner;

public class PatternMountNums {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 4;
            int k = 1;

            for(int i=1; i<=n; i++){
                //Spaces

                for(int j = 1; j<=n-i+1; j++){
                    System.out.print("  ");
                }
                //Stars
                for(int j = 1;j<=i; j++){
                    System.out.print(k++ + "  ");
                }
                System.out.println();
            }
        }
    }
