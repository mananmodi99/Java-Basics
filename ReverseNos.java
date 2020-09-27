
public class ReverseNos {
    public static void main(String[] args) {
        int n = 25182;
        int reverse = 0;
        while(n>0){
            int temp = n%10;
            reverse = reverse*10 + temp;
            n /= 10;
        }
        System.out.println(reverse);
    }
}

