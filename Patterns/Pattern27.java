package CBPatterns;
public class Pattern27 {
    public static void main(String[] args) {
        int n=5, nst = 1, nsp = 4;
        for(int rows = 1; rows<=n; rows++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            int val=1;
            for(int cst=1; cst<=nst; cst++)
            {
                if(cst<=nst/2)
                    System.out.print(val++ + "\t");
                else{
                    System.out.print(val-- + "\t");
                    }
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}
