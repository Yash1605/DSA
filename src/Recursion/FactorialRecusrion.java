package Recursion;


    import java.util.*;

    public class FactorialRecusrion {
        static long product(int n){
            //Write code here
            if(n==1)
                return 1;
            long ans=n*product(n-1);
            return ans;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println(product(n));
        }
    }

