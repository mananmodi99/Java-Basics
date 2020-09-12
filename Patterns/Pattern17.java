package CBPatterns;
public class Pattern17 {
    public static void main(String[] args) {
    int n=7,rows = 1, nst = 3, nsp=1;
    while(rows <= n){

        for(int cst = 1;cst<=nst; cst++){
            System.out.print("* ");
        }
        for(int csp=1 ; csp<=nsp; csp++){
            System.out.print("  ");
        }

        for (int cst = 1; cst<=nst; cst++){
            System.out.print("* ");
        }
        System.out.println();
        if(rows<4){
            nsp += 2;
            nst -= 1;

        }
        else{
            nsp-=2;
            nst+=1;
        }

        rows++;
    }
}
}
