package com.company;
import java.math.BigDecimal;
import java.util.*;
public class Main{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        for(int i=0;i<n+2;i++){
            for(int j=0;j<n-1;j++){
                if(Double.parseDouble(s[j])<Double.parseDouble(s[j+1])){
                    String temp=s[j+1];
                    s[j+1]=s[j];
                    s[j]=temp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}