import java.util.HashMap;
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        HashMap<Character,Integer> buffer = new HashMap<>();
        int i = 0;
        int charcount = 0;
        while(i<array.length){
            // System.out.println(charcount);
            char curr = array[i];
            if(buffer.containsKey(curr)){
                i = (buffer.get(curr)+1);
                buffer.clear();
                charcount = 0;
            }else{
                charcount++;
                buffer.put(curr, i);
                i++;
            }
            if(charcount == 4){
                System.out.println(i);
                break;
            }
        }


        sc.close();
    }
}
