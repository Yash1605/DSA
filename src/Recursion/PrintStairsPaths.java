package Recursion;
//https://course.acciojob.com/idle?question=c6abdf5c-6981-4f50-8908-0ce691ee6851
import java.io.*;
import java.util.*;

public class PrintStairsPaths {
    static void printStairPaths(int n,String psf) {
        if(n==0){
            System.out.println(psf);
            return;
        }
        printStairPaths(n-1,psf+"1");
        if(n>=2)printStairPaths(n-2,psf+"2");
        if(n>=3)printStairPaths(n-3,psf+"3");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }
}