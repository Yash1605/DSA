package Recursion;
import java.util.*;
public class NoX {
    static String noX(String s) {
        // Write your code here
        return help(s,"",0);
    }
    static String help(String s,String asf,int id){
        if(id==s.length())return asf;
        if(s.charAt(id)=='x')return help(s,asf,id+1);
        else return help(s,asf+s.charAt(id),id+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}
