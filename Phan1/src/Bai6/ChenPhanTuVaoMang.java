package Bai6;

import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int x=sc.nextInt();
        for(int i=n;i>=k+1;i--){
            arr[i]=arr[i-1];
        }
        arr[k]=x;
        n++;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
