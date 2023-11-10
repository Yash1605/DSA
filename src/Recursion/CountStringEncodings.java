package Recursion;
import java.util.*;
public class CountStringEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(countEncodings(str));
    }

    public static int countEncodings(String str) {
        // your code here
        ArrayList<String>bank=new ArrayList<>();
        helper(str,"",bank);
        return bank.size();
    }
    public static void helper(String str,String asf,ArrayList<String> bank){
        int len=str.length();
        if(len==0){
            bank.add(asf);
            return;
        }
        int num=str.charAt(0)-'0';
        if(num>0) helper(str.substring(1),asf+(char)('a'+num-1),bank);
        if(num==0||len==1)return;
        num=Integer.parseInt(str.substring(0,2));
        if(num<=26) helper(str.substring(2),asf+(char)('a'+num-1),bank);
    }
}
