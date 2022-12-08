import java.util.Scanner;

public class Day4dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pair = sc.nextLine();
        long count = 0;
        while(!pair.equals("-1")){
            String[] elfsassign = pair.split(",");

            String[] roomsS1 = elfsassign[0].split("-");
            String[] roomsS2 = elfsassign[1].split("-");

            Pair pair1 = new Pair(Integer.parseInt(roomsS1[0]), Integer.parseInt(roomsS1[1]));
            Pair pair2 = new Pair(Integer.parseInt(roomsS2[0]), Integer.parseInt(roomsS2[1]));

            if(pair1.encloses(pair2) || pair2.encloses(pair1)){
                count++;
            }
            pair = sc.nextLine();
        }
        System.out.println("The Number of overlaps are: "+count);
        sc.close();
    }
    static class Pair{
        int low;
        int high;
        public Pair(int low,int high){
            this.low = low;
            this.high = high;
        }
        public boolean encloses(Pair other){
            return ((other.low>=this.low && other.low<=this.high) || (other.high<=this.high && other.high>=this.low));
        }
    }
}
