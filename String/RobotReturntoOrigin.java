public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
        String moves1 = "LL";
        System.out.println(judgeCircle(moves1));

    }

    public static boolean judgeCircle(String moves) {
        int Updown = 0;
        int LeftRight = 0 ;

        for(char c : moves.toCharArray()){
            if(c == 'U'){
                Updown++;
            }
            else if(c == 'D'){
                Updown--;
            }
            else if(c == 'R'){
                LeftRight++;
            }
            else if(c == 'L'){
                LeftRight--;
            }
        }
        return (LeftRight == 0 && Updown == 0 );
    }
}
