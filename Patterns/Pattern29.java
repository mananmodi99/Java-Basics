package CBPatterns;
public class Pattern29 {
    public static void main(String[] args) {
        int n=5, nst = 1, nsp = 4, val =1, zero=0;
        for(int rows = 1; rows<=n; rows++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst; cst++){
                if(cst==1 || cst==nst)
                    System.out.print(rows + " ");
                else
                    System.out.print(zero + " ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}
