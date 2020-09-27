package CBPatterns;
public class Pattern15 {
    public static void main(String[] args) {
        int n=5, nst =5, nsp=0;
        for(int rows =1; rows<=(2*n-1); rows++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("* ");
            }
            System.out.println();
            if(rows<n){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
        }
    }
}
