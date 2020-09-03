public class TypeCasting {
    public static void main(String[] args) {
        //Automatic TypeCasting
        int x = 3;
        double y = x;
        System.out.print(x);
        System.out.print("\n");
        System.out.print(y);
        System.out.print("\n");
        double d = 3.14;
        System.out.print(d);
        System.out.print("\n");
        //Manual TypeCasting
        int i = (int) d;
        System.out.print(i);
    }
}