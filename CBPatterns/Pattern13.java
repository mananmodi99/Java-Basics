package CBPatterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n=5, rows = 1, nst = 1;
        while(rows<=(2*n-1)){
            int cst = 1;
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            if(rows < n){
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
            rows++;
        }
    }
}
