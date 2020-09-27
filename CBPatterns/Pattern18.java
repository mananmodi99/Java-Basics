package CBPatterns;
public class Pattern18 {
    public static void main(String[] args) {
        int n=7, rows = 1, nst=1, nsp=3;
        while(rows<=n){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for (int cst = 1; cst<=nst; cst++){
                System.out.print("* ");
            }
            System.out.println();
            if(rows<4){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
            rows++;
        }
    }
}
