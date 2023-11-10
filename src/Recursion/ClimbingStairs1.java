package Recursion;
import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int ClimbingStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ClimbingStairsMemo(n, dp);
    }

    public int ClimbingStairsMemo(int n, int[] dp) {
        if(dp[n] != -1)
            return dp[n];
        if(n == 0 || n == 1 || n == 2)
            return dp[n] = n;
        return dp[n] = ClimbingStairsMemo(n-1, dp) + ClimbingStairsMemo(n-2, dp);
    }
}

public class ClimbingStairs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(n));
    }
}