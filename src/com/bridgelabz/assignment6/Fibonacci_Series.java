package com.bridgelabz.assignment6;

import java.util.Scanner;

public class Fibanocci_Series {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n;
        int i;
        int count=10;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value n1 :");
        n1=s.nextInt();
        System.out.println("enter the value n2 :");
        n2=s.nextInt();

        for (i=0;i<count;i++)
            n=n1+n2;
        System.out.println("fibanocci series :");
        n1=n2;
        n2=n;



    }
}
