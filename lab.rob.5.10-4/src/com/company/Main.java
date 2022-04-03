package com.company;

public class Main {

    public static void main(String[] args) {
        int n,x,i;
        n = 6;
        x = 1;
        i = 1;
        for (;i <= n; i++)
            x *= i;
        System.out.println(x + "for");

        x = 1;
        i = 1;
        while(i <= n) {
            x *= i;
            i++;
        }
        System.out.println(x + "while");
    }
}
