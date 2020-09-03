import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Welcome to SI Calculator! Type SI to prove to verify!");
        String hello = input.nextLine();
        System.out.println("Principle: ");
        int p = input.nextInt();
        System.out.println("Principle: " + p);
        System.out.println("Rate: ");
        float r = input.nextFloat();
        System.out.println("Rate: " + r);
        System.out.println("time: ");
        int t = input.nextInt();
        System.out.println("time: " + t);
        float SI = 0f;
        SI = p*r*t/100;
        System.out.println("SI: " + SI);
    }
}
