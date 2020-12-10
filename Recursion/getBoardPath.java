package Recursion;

import java.util.ArrayList;

public class getBoardPath {
    public static void main(String[] args) {
        System.out.println(BoardPathArrayList(0, 0));
    }
    public static ArrayList<String> BoardPathArrayList(int start, int current){
        //Base-Case
        if(current == 10){
            ArrayList<String> base = new ArrayList<String>();
            base.add(" ");
            return base;
        }
        if(current > 10){
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }
        //Recursive
        ArrayList<String> myResult = new ArrayList<String>();
        for(int dice = 1; dice<=6; dice++){
            ArrayList<String> recursiveResult = BoardPathArrayList(start, current+dice);
            for(String recStr: recursiveResult)
                myResult.add(dice+recStr);
        }
        return myResult;
    }
}
