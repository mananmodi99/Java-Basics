import java.util.Scanner;

public class CheckPanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPangram = true;
        int[] ascii = new int[256];
        for (char s: str.toCharArray()) {
            int index = (int) s;
            ascii[index]++;
        }
        int count = 0;
        for (int a: ascii) {
            if(a > 0){
                count++;
            }
            //System.out.println(a);
        }
        if(count>= 26)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
