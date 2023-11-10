package Recursion;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
import java.io.*;
import java.util.*;

public class LetterCombinations {
    static void printKPC(String ques) {
        //Write your code here
        String ref[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        f(ques,"",ref);
    }
    static void f(String ques,String asf,String[]ref){
        if(ques.length()==0){
            System.out.println(asf);
            return ;
        }int d=ques.charAt(0)-'0';
        String res=ref[d];
        for(int i=0;i<res.length();i++)
            f(ques.substring(1),asf+res.charAt(i),ref);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str);
    }
}
