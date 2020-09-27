import java.util.Scanner;

public class HollowPyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1st Line
        System.out.print("* ");
        System.out.println();
        //2-(n-1)th line --> Star Print phir (i-2) spaces aur phir ek star
        for(int i=2;i<=n-1;i++){
            System.out.print("* ");
            for(int j=1; j<=i-2;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        //nth Line
        if(n>1) {                        //edgeCase
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }

        }
    }
}
