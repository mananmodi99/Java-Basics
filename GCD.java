public class GCD {
    public static void main(String[] args) {
        int divide = 3;
        int divisor = 5;
        int rem = divide%divisor;
        while(rem != 0){
            divide = divisor;
            divisor = rem;
            rem = divide%divisor;
        }
        System.out.println("The HCF/GCD is: " + divisor);
    }
}
