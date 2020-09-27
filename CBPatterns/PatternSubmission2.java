package CBPatterns;

import java.util.Scanner;
public class PatternSubmission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNext())
            n = sc.nextInt();
            n = Math.abs(n);
        int nst = 1,nst1=1, nsp = (2*n-1);
        for(int rows = 1; rows<=2*n+1; rows++){
            for(int cst = 1; cst <= nst; cst++){
                int val1 = 6-cst;
                System.out.print(val1+ "\t");
            }
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            int val1 = 6 - nst;
            for(int cst = 1; cst <= nst1; cst++){

                if(rows == n+1 && cst==n+1){
                    continue;
                }
                else{
                    if(rows == n+1 && cst==1){
                        val1++;
                        System.out.print(val1++ + "\t");}
                    else
                        System.out.print(val1++ + "\t");}
            }
            if(rows<n+1){

                nst++;
                nst1++;
                nsp-=2;
            }
            else{
                nst--;
                nst1--;
                nsp+=2;
            }
            System.out.println();
        }
    }
}
