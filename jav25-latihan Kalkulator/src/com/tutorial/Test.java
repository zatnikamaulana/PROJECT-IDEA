package com.tutorial;

import java.util.*;

public class Test {
    public static void main (String[]args){
        //operator a dan b
        Scanner inputPengguna;
        float a ,b , total ;
        char operasi;
        inputPengguna = new Scanner(System.in);

        System.out.print("masukan angka pertama = ");
        a = inputPengguna.nextFloat();
        System.out.print("masukan operasi = ");
        operasi = inputPengguna.next().charAt(0);
        System.out.print("masukan angka kedua = ");
        b = inputPengguna.nextFloat();

        System.out.println("Inputan = "+ a + " " + operasi + " " +b );


        if ( operasi == '+'){
            total = a + b;
            System.out.println("total nya ialah = "+ total);
        } else if (operasi == '-') {
            total = a - b;
            System.out.println("totalnya ialah = "+ total);

        }else if (operasi == '*') {
            total = a * b;
            System.out.println("totalnya ialah = "+ total);

        }else if (operasi == '/') {
            total = a / b;
            System.out.println("totalnya ialah = "+ total);

        }

    }
}
