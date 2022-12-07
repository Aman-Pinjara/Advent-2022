import java.util.HashSet;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allChars = "abcdefghijklmnopqrstuvwxyz"+"abcdefghijklmnopqrstuvwxyz".toUpperCase();
        char[] chars = allChars.toCharArray();

        String rucksack = sc.nextLine();
        long priority = 0;

        while(!rucksack.equals("-1")){

            char[] items = rucksack.toCharArray();

            int j = (items.length/2);
            char c = 'a';
            HashSet<Character> hc = new HashSet<>();
            for (int k = 0; k < j; k++) {
                hc.add(items[k]);
            }
            for (int k = j; k < items.length; k++) {
                if(hc.contains(items[k])){
                    c = items[k];
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
    static int getPriority(char c,char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if(c==chars[i]){
                return (i+1);
            }
        }
        return -1;
    }
}
