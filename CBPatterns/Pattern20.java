package CBPatterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n=7, nst = 1, nsp = 4;
        for(int rows=1; rows<=n; rows++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst = 1; cst<=nst; cst++){
                if(cst == 1|| cst == nst)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if(rows<=(n/2)){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
        System.out.println();
        }

    }
}
