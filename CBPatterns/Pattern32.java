package CBPatterns;
public class Pattern32 {
    public static void main(String[] args) {
        int n=5, nst=1;
        for(int rows=1; rows<=(2*n-1); rows++) {
            int val=rows;
            for (int cst = 1; cst <= 2*nst-1; cst++) {
                if(cst%2==0)
                    System.out.print("* ");
                else
                if(val<=n)
                    System.out.print(val + " ");
                else
                    System.out.print((2*n-1)-rows+1 + " ");
            }
            if (rows < n)
                nst+=1;
            else
                nst-=1;
            System.out.println();
        }
    }
}
