package CBPatterns;
public class Pattern7 {
    public static void main(String[] args) {
        int n=5,nst=5;
        for(int rows=1; rows<=n; rows++) {
            for (int cst = 1; cst <= nst; cst++) {
                if (rows == 1 || rows == 5 || cst ==1 || cst == 5)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
