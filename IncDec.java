import java.util.*;
public class Main {
	public static boolean isValid(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = Integer.MAX_VALUE;
		while(n-->0){
			int num = sc.nextInt();
			if(num>=prev){
				prev = num;
				break;
			}
			prev = num;
		}
		boolean bool = false;
		while(n-->0){
			
			int num = sc.nextInt();
			if(num<=prev){
				// System.out.println("false");
				return false;
			}
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isValid());
    }
}
