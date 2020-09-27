import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while(temp >0){
            int rem = temp%10;
            reverse = reverse*10 + rem;
            temp /= 10;
        }
        System.out.println("The Reversed number is: "+ reverse);
        if(reverse == n )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
