package CBPatterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n=5, nst =1, nsp = 7;
        for(int rows = 1; rows<=n; rows++){
            for(int cst =1; cst<=nst; cst++){
                System.out.print("* ");
            }
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst = 1; cst<=nst; cst++){
                if(rows == n){
                    nst = n-1;
                }
                System.out.print("* ");

            }
            System.out.println();
            nst++;
            nsp =nsp - 2;

        }
    }
}

