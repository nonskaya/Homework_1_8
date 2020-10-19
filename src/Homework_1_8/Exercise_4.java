package Homework_1_8;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []a=new int[x];
        a[0]=4;
        System.out.print(a[0]+" ");
        for(int i=1;i<x;i++){
           a[i]+=a[i-1]+3;
            System.out.print(a[i]+" ");
        }
    }
}
