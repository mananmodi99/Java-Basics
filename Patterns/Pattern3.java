package CBPatterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n =5, nst = 5;
        int rows =1;
        while(rows<=n){
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            rows++;
            nst--;
        }
//        for(rows = 0; rows<n ; rows++){
//            for(int cst = 0; cst<nst; cst++){
//                System.out.print("* ");
//            }
//            System.out.println();
//            nst--;
//        }
    }
}
