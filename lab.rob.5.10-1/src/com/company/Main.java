package com.company;

public class Main {

    public static void main(String[] args) {
	int i = 500;
    for(;i < 650; i += 10)
        System.out.println(i + "y");

    i = 500;
    while (i < 650 ) {
        System.out.println(i + "yy");
        i += 10;
    }
    i = 500;
    do{
        System.out.println(i + "yyy");
        i += 10;
    } while(i < 650);
    }
}
