package CBPatterns;

public class Pattern30 {
    public static void main(String[] args) {
        int n=5, nst = 1;
        for(int rows = 1; rows<=n; rows++){
            for(int cst=5; cst>=nst; cst--){
                if(cst != nst-rows-1)
                    System.out.print(cst + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
