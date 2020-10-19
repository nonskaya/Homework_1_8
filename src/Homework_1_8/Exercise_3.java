package Homework_1_8;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a= new int[n];
        float answ=0f;
        boolean bol=false;
        int nechet=0;
        int temp=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                temp+=a[i];
                bol=true;
                nechet++;
            }
        }if(bol){
            answ=temp/nechet;
            System.out.println(answ);
            bol=true;
        }else{
            System.out.println("NO");
        }

    }
}


