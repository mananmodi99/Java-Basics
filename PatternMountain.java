import java.util.Scanner;

public class PatternMountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //Spaces
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            //Stars
            for(int j = 1;j<=i; j++){
                System.out.print("*  ");
            }
//            for(int j = 2; j<=i; j++){
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }
}
