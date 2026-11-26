package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner programAsu = new Scanner(System.in);
        System.out.println("Masukan angka = ");
        int a = programAsu.nextInt();

        //tutorial if else statement
        //int a = 3;
        //System.out.println("Ini Adalah Awal program");

        //if else statement
        if (a == 5){
            System.out.println("INI adalah aksi pertama");

        } else if (a == 10) {
            System.out.println("Ini adalah aksi kedua");

        }else{
            System.out.println("Ini adalah default");
        }
        //akhir program
        System.out.println("Ini adalah akhir program");

    }
}
