package Recursion;
import java.util.*;

public class CountAbc {
    static int CountABC(String str, int i) {
        if(i>=str.length()-2)return 0;
        if(str.charAt(i)=='a'){
            if(str.charAt(i+1)=='b'){
                if(str.charAt(i+2)=='a'||str.charAt(i+2)=='c')
                    return 1+CountABC(str,i+1);
            }
        }return CountABC(str,i+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s, 0));

    }
}
