package Recursion;

import java.util.*;
public class MinINArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, 0));
    }

    public static int recforMin(int[] arr, int idx) {
        //Write your code here
        if(idx==arr.length-1)return arr[idx];
        int min=recforMin(arr,idx+1);
        return Math.min(min,arr[idx]);
    }
}