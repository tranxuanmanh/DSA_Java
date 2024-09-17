package Bai5;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tong=0,dem=0;
        for(int i=0;i<arr.length;i++){
            if(checknt(arr[i])){
                tong+=arr[i];
                dem++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.printf("Trung binh cac so nt : %.2f",(float)tong/dem);
    }
    public static boolean checknt(int a){
        if(a<2) return true;
        else{
            for(int i=2;i<=Math.sqrt(a);i++){
             if(a%i==0) {return false;}
        }
        return true;
        }
    }
}
