package CBPatterns;

public class Pattern31 {
    public static void main(String[] args) {
        int n=5, nst = 5;
        for(int rows = 1; rows<=n; rows++){
            int val=5;
            for(int cst=1; cst<=nst; cst++){
                if(cst == nst-rows+1)
                    System.out.print("* ");
                else
                    System.out.print(val-- + " ");
            }
            System.out.println();
        }
    }
}
