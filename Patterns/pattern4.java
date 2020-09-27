package CBPatterns;

public class pattern4 {
    public static void main(String[] args) {
        int n=5, nsp=n-1, nst=1, rows=1;
        while(rows<=n){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            nsp--;
            int cst =1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            nst++;
            System.out.println();
            rows++;
        }
    }
}
