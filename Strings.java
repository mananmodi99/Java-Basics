public class Strings {
    public static void main(String[] args) {
        String name = "Manan";//By Literal - String Pool area
        String name2 = new String("Manan");//By New Object - Heap Memory
        if(name == name2)
            System.out.println("True");
        else
            System.out.println("Fs");
        //Functions in Strings

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(1,4));
        System.out.println(name.contains("ana"));
        System.out.println(name2.equals(name));
        System.out.println(name.isEmpty());
        System.out.println(name.concat("_Modi"));
        System.out.println(name.replace('a','.'));
        System.out.println(name);
        String cars = "Maruti,Suzuki,Hyundai,Lambo,Merseratti";
        String[] allCars = cars.split(",");
        for (String item:
             allCars) {
            System.out.print(item+ " ");

        }
        System.out.println();
        System.out.println(name.indexOf("M"));
        name = name.toLowerCase();
        System.out.println(name);
    }
}
