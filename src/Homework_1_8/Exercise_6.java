package Homework_1_8;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int m=0;
        int scht=0;
        int a[]=new int[n];
        boolean answ=false;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           if(scht>m){
               m=scht;
               p=i-1;
               scht=0;
           }
            for(int j=0;j<n;j++){
                if(a[i]==a[j]&&i!=j){
                    scht++;
                    answ=true;
                }
            }
        }if(answ){
        System.out.println(a[p]);}
        else{
            int naim=0;
            for(int i=0;i<n;i++) {
                if (scht < naim) {
                    m = scht;
                    p = i - 1;

                }scht=0;
                for (int j = 0; j < n; j++) {
                    if (a[i] > a[j] && i != j) {
                        scht++;
                    }

                }
            }
            System.out.println(a[p]);
        }
    }
}
