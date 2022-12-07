import java.util.Scanner;

public class Day2dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        long score = 0;

        while(!input.equals("-1")){
            String[] arr = input.split(" ");
            RPSI in;
            if(arr[0].equals("A")){
                in = RPSI.A;
            }else if(arr[0].equals("B")){
                in = RPSI.B;
            }else{
                in = RPSI.C;
            }
            WinOrLose out;
            if(arr[1].equals("X")){
                out = WinOrLose.X;
            }else if(arr[1].equals("Y")){
                out = WinOrLose.Y;
            }else{
                out = WinOrLose.Z;
            }
            score += winloseScore(out);
            score += outputScore(in, out);

            // System.out.println("Temp score" + score);

            input = sc.nextLine();
        }

        System.out.println("The Total score is: "+score);
        sc.close();
    }

    enum RPSI{
        //Stone paper scissor input
        A, // Rock
        B, // Paper
        C // Scissor
    }
    enum WinOrLose{
        //Stone paper scissor output
        X, //Lose
        Y, //Draw
        Z, //Win
    }


    static int winloseScore(WinOrLose out){
        switch (out) {
            case X:
                return 0;
            case Y:
                return 3;
            case Z:
                return 6;
        }
        return -1;
    }

    static int outputScore(RPSI in,WinOrLose out){
        switch(in){
            case A:
                switch (out) {
                    case X:
                        return 3;
                    case Y:
                        return 1;
                    case Z:
                        return 2;
                }
                return -1;
            case B:
                switch (out) {
                    case X:
                        return 1;
                    case Y:
                        return 2;
                    case Z:
                        return 3;
                }
                return -1;
            case C:
                switch (out) {
                    case X:
                        return 2;
                    case Y:
                        return 3;
                    case Z:
                        return 1;
                }
                return -1;
        }
        return -1;
    }
}
