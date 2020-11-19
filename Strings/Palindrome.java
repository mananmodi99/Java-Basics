package Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        boolean isPalindrome = false;
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse)){
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }
}
