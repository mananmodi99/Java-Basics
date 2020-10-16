package Basic;

public class SieveofEratosthenes {
    public static int PrimeSeive(int number){
        boolean isPrime[] = new boolean[number];
        if(number>1){
            isPrime[0] = false;
            isPrime[1] = false;}
        for(int i = 2; i<number; i++)
            isPrime[i] = true;
        for(int i=2; i*i<number;i++){
            if(isPrime[i] == true){
                for(int j=i*i; j<number;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=0; i<number; i++){
            if(isPrime[i] == true )
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The number of Prime Numbers in Most efficient Manner are: " + PrimeSeive(num));
    }
}
