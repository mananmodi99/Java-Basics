package CBPatterns;

public class Pattern33 {
    public static void main(String[] args) {
        int n=10, nst = 1, nsp = n-1;
        for(int rows = 1; rows<=n; rows++){
            int val = n-rows+1;
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst; cst++){
                if(cst==rows)
                    System.out.print(0 + " ");
                else
                    if(cst >= nst/2+1)
                        System.out.print(--val + " ");
                    else
                        System.out.print(val++ + " ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        };
    }
}
