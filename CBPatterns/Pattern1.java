package CBPatterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 10;
        int rows =0;
        while (rows<n){
            int cols =0;
            while (cols<n){
                System.out.print("* ");
                cols++;
            }
            System.out.println();
            rows++;
        }
    }
}
