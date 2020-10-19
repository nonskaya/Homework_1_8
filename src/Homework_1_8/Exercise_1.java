package Homework_1_8;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean ans=true;
        int n= sc.nextInt();
        int [] a=new int[n+1];
        for(int i=1;i<n+1;i++){
             a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=1;i<n+1;i++){
            if(a[i]==x){
                System.out.println(i);
             ans=true;
             break;
            }else {
                ans=false;
            }

        }
        if(!ans){
            System.out.println("NO");
        }

    }
}
