package Recursion;
import java.util.*;
import java.util.Scanner;

public class PrintAllSubsequence{
    static void printSubsequence(String s) {
        //Write your code here
        helper(s,"",0);
    }
    static void helper(String s, String asf,int idx){
        if(idx==s.length()){
            System.out.print(asf+" ");
            return;
        }
        helper(s,asf+s.charAt(idx),idx+1);
        helper(s,asf,idx+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}
