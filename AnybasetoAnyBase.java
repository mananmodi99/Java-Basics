import java.util.Scanner;

public class AnybasetoAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inBase = sc.nextInt();
        int toBase = sc.nextInt();
        int decimal = AnybaseToDecimal(n,inBase);
        System.out.print(decimalToAnybase(decimal, toBase));

    }
    public static int AnybaseToDecimal(int n, int inBase){
        int converted = 0;
        int temp = 0;
        while(n>0){
            int rem = n%10;
            converted = converted + rem*((int) Math.pow(inBase,temp));
            n/=10;
            temp++;
        }
        return converted;
    }

    public static int decimalToAnybase(int decimal, int toBase){
        int converted = 0, temp = 0;
        while(decimal>0){
            int rem = decimal%toBase;
            converted = converted + rem*((int) Math.pow(10,temp));
            temp++;
            decimal/=toBase;
        }
        return converted;
    }
}
