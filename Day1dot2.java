import java.util.PriorityQueue;
import java.util.Scanner;

public class Day1dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Long> maxCal = new PriorityQueue<>();

        String over = "1";
        
        while(!over.equals("-1")){     
            String input = over;
            long sum = 0;
            while(!input.equals("")){
                sum += Integer.parseInt(input);
                input = sc.nextLine();
            }
            if(maxCal.size()!=3){
                maxCal.add(sum);
            }else{
                if(maxCal.peek()<sum){
                    maxCal.poll();
                    maxCal.add(sum);
                }
            }

            over = sc.nextLine();
        }
        long sum = 0;
        while(!maxCal.isEmpty()){
            sum += maxCal.poll();
        }
        System.out.println("Max sum is : "+sum);
        sc.close();
    }
}
