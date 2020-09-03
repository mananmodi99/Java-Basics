import java.util.Scanner;
public class ArithmeticOperators {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        double div = (double) num1 / (double) num2;
        double rem = num1 % num2;
        System.out.println(div);
        System.out.println(rem);

    }
}
