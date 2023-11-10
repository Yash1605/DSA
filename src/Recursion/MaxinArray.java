package Recursion;
import java.io.*;
import java.util.Scanner;

public class MaxinArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int result=maxElement(nums);
        System.out.print(result);
    }

    public static int maxElement(int[] arr){
        //Write your code here
        return helper(arr,0);
    } static int helper(int []arr,int i){
        if(i==arr.length-1)return arr[arr.length-1];
        int maxi=helper(arr,i+1);
        return Math.max(maxi,arr[i]);

    }
}

