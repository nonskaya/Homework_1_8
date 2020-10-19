package tempr;

import java.util.Scanner;

public class three {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a= new int[n];
        double answ=0;
        boolean bol=false;       int nechet=0;
        int temp=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                temp=+a[i];
                bol=true;
                nechet++;
            }
        }if(bol){
            answ=temp/2;
            System.out.println(answ);
        }else{
            System.out.println("NO");
        }

    }
}
