package CBPatterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5, nst = 5, nsp = 0, rows = 1;
        while(rows<=n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }
            nsp++;
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            nst--;
            System.out.println();
            rows++;
        }
    }
}
