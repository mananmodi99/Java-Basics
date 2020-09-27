package CBPatterns;
public class Pattern8 {
    public static void main(String[] args) {
        int n=5, nst = 5;
        for(int rows = 1; rows<=n; rows++){
            for(int cst=1; cst<=nst; cst++){
                if((cst == rows) || (cst == n+1-rows))
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
