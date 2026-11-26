package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner inputUser = new Scanner(System.in);
        //mengambil data dari user
        System.out.println("Masukan Nilai anda = ");
        byte nilai = inputUser.nextByte();

        if(nilai > 90){
            System.out.println("Anda Mendapatkan Nilai A!");
        } else if (nilai > 80) {
            System.out.println("anda mendaptkan nilai B");

        } else if (nilai > 50) {
            System.out.println("Anda mendapatkan Nilai C");

        }else {
            System.out.println("Anda tidak Lulus!");
        }
        System.out.println("Mohon belajar lagii sayangg!");
    }
        //nested atau if bersarang
        /*int a = 5;
        int b = 3;

        System.out.println("Ini adalah awal program");

        if (a == 5){
            if (b == 10){
                System.out.println("Ini adalah dimana A dan B benar! ");
            }else{
                System.out.println("Ini adalah dimana A benar dan B salah!");
            }
        }else{
            System.out.println("Ini adadalah dimana A salah!");
        }
        System.out.println("Ini akhir dari program!");
    }*/
}
