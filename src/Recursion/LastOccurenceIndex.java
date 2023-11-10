package Recursion;

import java.util.Scanner;
class LastOccurenceIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        int T = s.nextInt();
        System.out.println(lastIndex(A, T, N-1));
    }
    static int lastIndex(int A[],int T,int si)
    {if(si==0)return -1;
        if(A[si]==T)return si;
        return lastIndex(A,T,si-1);
    }
}
