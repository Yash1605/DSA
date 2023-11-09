package Recursion;

import java.util.Scanner;

public class toh2{

    static void towersOfHanoi(int n, char source, char dest) {
        char aux=(char)('A'+'B'+'C'-source-dest);
        if(n==0){
            // System.out.println("Moving ring "+n+" from "+source+" to "+ dest);
            return;
        }  towersOfHanoi(n-1,source,aux);
        System.out.println("Moving ring "+n+" from "+source+" to "+ dest);
        towersOfHanoi(n-1,aux,dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'B'); // move n disks from A to B
    }
}
