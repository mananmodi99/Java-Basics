package CBPatterns;
public class Pattern19 {
    public static void main(String[] args) {
        int n=7, nst = 4,nst1 = 4, nsp = 0;
        for(int rows = 1; rows<=n; rows++){
            for(int cst=1; cst<=nst; cst++){
                System.out.print("* ");
            }
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst1; cst++){
                if(rows == 1 || rows == n)
                    nst1 = n/2;
            System.out.print("# ");
            }
        if(rows<=n/2){
            nst--;
            if(rows!=1)
                nst1--;
            nsp+=2;
        }
        else{
            nst++;
            nst1++;
            nsp-=2;
        }
        System.out.println();
        }
    }
}
