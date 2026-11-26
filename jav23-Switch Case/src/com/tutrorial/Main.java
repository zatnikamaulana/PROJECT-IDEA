package com.tutrorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan Nama = ");
        input = inputUser.next();


        switch (input){
            case "zatnika":
                System.out.println("siap zatnika hadirr bang!!");
                break;
            case "cici":
                System.out.println("Siap cici hadir bangg!!");
                break;
            case "eko":
                System.out.println("siap eko hadir bangg!!");
                break;
            default:
                System.out.println(input +" tidak hadir abanggku!!");
        }
        System.out.println("Program Selesai!");
    }
}
