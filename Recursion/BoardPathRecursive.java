package Recursion;
public class BoardPathRecursive {
    public static void main(String[] args){
        BoardPath(0, 0, "");
    }
    public static void BoardPath(int start, int n, String ans){
        if(n==10){
            System.out.println(ans);
        }
        if(n>10){
            return;
        }

        for(int i=1; i<=6; i++) {
            BoardPath(start, n + i, ans + i);
        }

    }
}
