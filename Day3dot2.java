import java.util.HashSet;
import java.util.Scanner;

public class Day3dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allChars = "abcdefghijklmnopqrstuvwxyz"+"abcdefghijklmnopqrstuvwxyz".toUpperCase();
        char[] chars = allChars.toCharArray();

        String rucksack = sc.nextLine();
        long priority = 0;

        while(!rucksack.equals("-1")){
            char c = 'a';
                
            char[] items = rucksack.toCharArray();
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();

            fillHas(hs1, items);
            rucksack = sc.nextLine();
            items = rucksack.toCharArray();
            fillHas(hs2, items);
            rucksack = sc.nextLine();
            items = rucksack.toCharArray();


            for (char d : items) {
                if(hs1.contains(d) && hs2.contains(d)){
                    c = d;
                    break;
                }
            }

            int localp = getPriority(c, chars);
            // System.out.println("Local p is "+localp);

            priority += localp;
            
            rucksack = sc.nextLine();  
        }
        System.out.println("Priority is: "+priority);
        sc.close();
    }

    static void fillHas(HashSet<Character> hs, char[] c){
        for (char d : c) {
            hs.add(d);
        }
    }

    static int getPriority(char c,char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if(c==chars[i]){
                return (i+1);
            }
        }
        return -1;
    }
}
