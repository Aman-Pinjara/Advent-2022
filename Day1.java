import java.util.Scanner;

public class Day1{
    public static void main(String[] args) {
        long maxCalories = 0;

        Scanner sc = new Scanner(System.in);

        String over = "1";
        
        while(!over.equals("-1")){     
            String input = over;
            long sum = 0;
            while(!input.equals("")){
                sum += Integer.parseInt(input);
                // System.out.println("Input is: "+ input);
                input = sc.nextLine();
            }
            maxCalories = sum>maxCalories? sum:maxCalories;
            over = sc.nextLine();
        }

        System.out.println("Max sum is : "+maxCalories);
        sc.close();
    }
}