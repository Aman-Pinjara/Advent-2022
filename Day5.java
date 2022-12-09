import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Character>> stacks = new ArrayList<>();

        //TEST inputs   
        // int stackcount = 3;
        // ArrayList<Character> stack1 = new ArrayList<>();
        // stack1.add('z');
        // stack1.add('n');
        // ArrayList<Character> stack2 = new ArrayList<>();
        // stack2.add('m');
        // stack2.add('c');
        // stack2.add('d');
        // ArrayList<Character> stack3 = new ArrayList<>();
        // stack3.add('p');
        // stacks.add(stack1);
        // stacks.add(stack2);
        // stacks.add(stack3);


        //Answer inputs   
        // int stackcount = 9;
        char[] a = "qswczvft".toCharArray();
        ArrayList<Character> stack1 = new ArrayList<>();
        fromArrtoAl(stack1, a);

        char[] b = "qrb".toCharArray();
        ArrayList<Character> stack2 = new ArrayList<>();
        fromArrtoAl(stack2, b);

        char[] c = "bztqpms".toCharArray();
        ArrayList<Character> stack3 = new ArrayList<>();
        fromArrtoAl(stack3, c);

        char[] d = "dvfrqh".toCharArray();
        ArrayList<Character> stack4 = new ArrayList<>();
        fromArrtoAl(stack4, d);

        char[] e = "jgldbstp".toCharArray();
        ArrayList<Character> stack5 = new ArrayList<>();
        fromArrtoAl(stack5, e);

        char[] f = "wrtz".toCharArray();
        ArrayList<Character> stack6 = new ArrayList<>();
        fromArrtoAl(stack6, f);

        char[] g = "hqmnsfrj".toCharArray();
        ArrayList<Character> stack7 = new ArrayList<>();
        fromArrtoAl(stack7, g);

        char[] h = "rnfhw".toCharArray();
        ArrayList<Character> stack8 = new ArrayList<>();
        fromArrtoAl(stack8, h);

        char[] il = "jztqprb".toCharArray();
        ArrayList<Character> stack9 = new ArrayList<>();
        fromArrtoAl(stack9, il);
        
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);



        String inputs = sc.nextLine();
        while(!inputs.equals("-1")){
            int[] input = getValues(inputs);
            //0=> count, 1=> From, 2=> To
            ArrayList<Character> fromList = stacks.get(input[1]-1);
            ArrayList<Character> toList = stacks.get(input[2]-1);
            for (int i = fromList.size()-1; i >= fromList.size()-input[0]; i--) {
                toList.add(fromList.get(i));
            }
            for (int i = 0; i < input[0]; i++) {
                fromList.remove(fromList.size()-1);
            }
            // for (ArrayList<Character> stack : stacks) {
            //     for (Character character : stack) {
            //         System.out.print(character+" ");
            //     }
            //     System.out.println();
            // }
            // toList.addAll(temp);

            inputs = sc.nextLine();
        }
        for (ArrayList<Character> character : stacks) {
            System.out.print(Character.toUpperCase(character.get(character.size()-1)));
        }
        sc.close();

    }
    static int[] getValues(String input){
        int[] ans = new int[3];
        String[] b = input.split("from");

        String[] d = b[0].split(" ");
        ans[0] = Integer.parseInt(d[1]);
        String[] e = b[1].split("to");
        ans[1] = Integer.parseInt(e[0].trim());
        ans[2] = Integer.parseInt(e[1].trim());

        return ans;
    }
    static void fromArrtoAl(ArrayList<Character> stack, char[] a){
        for (char c : a) {
            stack.add(c);
        }
    }
}
