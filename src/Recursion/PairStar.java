package Recursion;
import java.util.*;
public class PairStar {
    static String PairStar(String str) {
        //Write your code here
        return help(str,"",0);
    }
    static String help(String str,String asf,int idx){
        if(idx==str.length()-1){
            asf= asf+str.charAt(idx);
            return asf;

        }if(str.charAt(idx)==str.charAt(idx+1))return help(str,asf+str.charAt(idx)+"*",idx+1);
        return help(str,asf+str.charAt(idx),idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PairStar(s));
    }
}
