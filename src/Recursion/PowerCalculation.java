package Recursion;
import java.util.*;

class PowerCalculation {
    public static long xPowerN(int x, int n){
        //write code here
        if(n==1) return x;
        return x*xPowerN(x,n-1);


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(xPowerN(x, n));
    }
}
