package com.company;

public class Main {

    public static void main(String[] args) {
        int t1, s1, t2, s2, n ;
        n = 1 ;
        for (int x = 1; x <= 24; x++){
            t1 = x/10;
            s1 = x%10;
            for (int y = 1; y <= 60; y++){
                t2 = y/10;
                s2 = y%10;
                if (t1 == s2 & t2 == s1){
                    System.out.println(t1 + "" + s1 + ":" + t2 + "" + s2);
                    n++;
                }
            }
        }
        System.out.println("Всього співпадінь " + n);
    }
}
