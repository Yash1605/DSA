package Recursion;

import java.io.*;
import java.util.*;

class OptimisedPowerCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N;
        X = sc.nextInt();
        N = sc.nextInt();

        System.out.println(power(X,N));
    }

    public static long power(int x, int y)
    {
        if(y==0)
            return 1l;
        long a= power(x,y/2);
        if(y%2==0)
            return a*a;
        return a*x*a;

    }
}

