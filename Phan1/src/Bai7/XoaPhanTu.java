package Bai7;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=k;i<n;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
