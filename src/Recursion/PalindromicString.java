package Recursion;
import java.io.*;
import java.util.Scanner;
public class PalindromicString {
    static boolean isPalindrome(String str){
        // Write your code here
        return helper(str,0,str.length()-1);
    } static boolean helper(String str,int i,int n){
        if(i>n){
            return true;
        } if(str.charAt(i)!=str.charAt(n))return false ;
        return helper(str,i+1,n-1);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=isPalindrome(str);
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}