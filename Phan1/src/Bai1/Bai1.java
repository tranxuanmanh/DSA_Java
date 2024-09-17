package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    int []arr=new int[50];
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int tong=0;
    for(int i=0;i<n;i++){
        tong+=arr[i];
    }
        System.out.println(tong);

    }
}
