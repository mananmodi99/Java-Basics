package CBPatterns;
public class Pattern14 {
    public static void main(String[] args) {
        int n=5, nst=1, nsp= 4;
        for(int rows=1; rows<=2*n-1; rows++){
            for(int csp =1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("* ");
            }

            System.out.println();
            if(rows<n){
                nst++;
                nsp--;
            }
            else{
                nst--;
                nsp++;
            }
        }
    }
}
