import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int[][] trzynatrzy = new int[3][3];
            trzynatrzy[0][0] = 1;
            trzynatrzy[0][1] = 2;
            trzynatrzy[0][2] = 3;
            trzynatrzy[1][0] = 4;
            trzynatrzy[1][1] = 5;
            trzynatrzy[1][2] = 6;
            trzynatrzy[2][0] = 7;
            trzynatrzy[2][1] = 8;
            trzynatrzy[2][2] = 9;

        System.out.println(Arrays.deepToString(trzynatrzy));
    }
    }