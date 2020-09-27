package CBPatterns;

public class Pattern24 {
    public static void main(String[] args) {
        int n=5, nst = 1, nsp = 4;
        for(int rows = 1; rows<=n; rows++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print(rows + "\t ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}
