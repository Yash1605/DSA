package Recursion;
import java.io.*;
import java.util.*;

public class CountMazePaths{
    static int countMazePath(int n, int m)
    {
        ArrayList<String>paths=new ArrayList<>();
        helper(n,m,1,1,paths,"");
        return paths.size();
    }
    static void helper(int n,int m,int i,int j,ArrayList<String>paths,String psf){
        if(n==i&&m==j){
            paths.add(psf);
            return;
        }   if(i>n||j>m)return;
        helper(n,m,i,j+1,paths,psf+"h");
        helper(n,m,i+1,j,paths,psf+"v");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m));
    }
}