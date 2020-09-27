package CBPatterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5,nst=1,nsp= 4;
        for(int rows=1; rows<=n; rows++){
            for(int csp = 1;csp<=nsp; csp++){
                System.out.print("  ");
            }
            for(int cst=1; cst<=nst; cst++){
                if(cst%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("! ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
