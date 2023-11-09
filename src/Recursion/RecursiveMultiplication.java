package Recursion;


    import java.io.*;
import java.util.*;
    public class RecursiveMultiplication  {
        public static void multiplyRecursively(int n, int m) {
            int ans= helper(n,m);
            System.out.println(ans);
        } static int helper(int n,int m){
            if(n==1) return m;
            return m+helper(n-1,m);
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            multiplyRecursively(n, m);
        }
    }

