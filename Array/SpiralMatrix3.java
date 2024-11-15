import java.util.Scanner;

public class SpiralMatrix3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int rows = s.nextInt();
        System.out.print("Enter Cols : ");
        int cols = s.nextInt();
        System.out.print("Enter Row : ");
        int rStart = s.nextInt();
        System.out.print("Enter Row : ");
        int cStart = s.nextInt();

        int[][] ans = spiralMatrixIII(rows, cols, rStart, cStart);
        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0 ; j < ans[i].length ; j++){
                System.out.print(ans[i][j] + " ");
            }
        }
    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int direction[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = rows * cols;
        int res[][] = new int[n][2];
        res[0][0] = rStart;
        res[0][1] = cStart;
        int count = 1 , step = 1 , index = 0;

        while(count<n){
            for(int times = 0 ; times < 2 ; times++){
                int dr = direction[index%4][0];
                int dc = direction[index%4][1];
                for(int i = 0 ; i < step ; i++){
                    rStart += dr;
                    cStart += dc;
                    if(rStart >=0 && rStart < rows && cStart >= 0 && cStart < cols){
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
}
