package Recursion;

import java.util.ArrayList;

public class getMazePath {
    public static void main(String[] args) {
        System.out.println(MazePath(0,0));
    }
    public static ArrayList<String> MazePath(int row, int col){
        //Base-Case
        if(row==2 && col==2){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        if(row>2 || col>2){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        //Recursion
        ArrayList<String> RecursiveRes1 = MazePath(row+1, col);
        ArrayList<String> RecursiveRes2 = MazePath(row, col+1);
        ArrayList<String> myResult = new ArrayList<>();
        for(String rrs1: RecursiveRes1)
            myResult.add("H"+rrs1);

        for(String rrs2: RecursiveRes2)
            myResult.add("V"+rrs2);

        return myResult;
    }
}
