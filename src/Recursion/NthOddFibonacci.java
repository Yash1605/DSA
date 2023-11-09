package Recursion;


import java.util.*;

class Solution {
    public int helpBob(int n) {
        //Write code here
        if(n==1||n==2)return 1;
        if(n%2==0) return 2*helpBob(n-1)-helpBob(n-2);
        else
            return 2*helpBob(n-1)+helpBob(n-2);
    }
}

public class  NthOddFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.helpBob(n);
        System.out.println(result);
        sc.close();
    }
}
