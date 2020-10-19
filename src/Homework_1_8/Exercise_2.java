package Homework_1_8;

import java.util.Scanner;

public class Exercise_2 {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int tempr=0;
            boolean answ=false;
            int n=sc.nextInt();
            int []b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(b[i]%2==0){
                    tempr+=b[i];
                    answ=true;
                }

            }
            if(answ==true){
                System.out.println(tempr);
            }else{
                System.out.println("NO");
            }
        }
    }


