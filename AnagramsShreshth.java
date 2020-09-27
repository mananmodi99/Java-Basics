import java.util.Scanner;
    public class AnagramsShreshth {

        static boolean isAnagram(String a, String b) {

            a=a.toLowerCase();
            b=b.toLowerCase();
            int z[] = new int[26];

            boolean check = true;
            if(a.length()!=b.length())
                check = false;

            else{
                for(int i=0; i<a.length(); i++){
                    int index = (int)a.charAt(i);
                    int index2 = (int)b.charAt(i);
                    z[index-97]+=1;
                    z[index2-97]-=1;
                }
                for(int i=0; i<26; i++){
                    if(z[i]!=0){
                        check = false;
                        break;
                    }
                }

            }
            return check;
        }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

