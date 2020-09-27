import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n /=10;
            sum += rem;
        }
        System.out.printf("The Sum of is : %d\n",sum);

    }
}
