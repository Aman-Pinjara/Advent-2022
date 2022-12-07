import java.util.Scanner;

public class Day2 {
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
            RPSO out;
            if(arr[1].equals("X")){
                out = RPSO.X;
            }else if(arr[1].equals("Y")){
                out = RPSO.Y;
            }else{
                out = RPSO.Z;
            }
            score += winloseScore(in, out);
            score += outputScore(out);

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
    enum RPSO{
        //Stone paper scissor output
        X, //Rock
        Y, // Paper
        Z, // Scissor
    }


    static int winloseScore(RPSI in, RPSO out){
        switch (in) {
            case A:
                switch (out) {
                    case X:
                        return 3;
                    case Y:
                        return 6;
                    case Z:
                        return 0;
                }
                return -1;
            case B:
                switch (out) {
                    case X:
                        return 0;
                    case Y:
                        return 3;
                    case Z:
                        return 6;
                }
                return -1;
            case C:
                switch (out) {
                    case X:
                        return 6;
                    case Y:
                        return 0;
                    case Z:
                        return 3;
                }
                return -1;  
        }
        return -1;
    }

    static int outputScore(RPSO out){
        switch(out){
            case X:
                return 1;
            case Y:
                return 2;
            case Z:
                return 3;
        }
        return -1;
    }
}
