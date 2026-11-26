package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //operator a dan b
        Scanner  inputUser;
        float a , b , hasil;
        char operator;

        inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai A = ");
        a = inputUser.nextFloat();

        System.out.print("Masukan Operator = ");
        operator = inputUser.next().charAt(0);

        System.out.print("Masukan Nilai B = ");
        b = inputUser.nextFloat();

        System.out.println("Input User : "+ a + "" + operator + "" + b);

        //opertaor yg tersedia

        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil = "+ hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println("hasil = "+ hasil);
        } else if (operator == '*') {
            hasil   = a * b;
            System.out.println("hasil = "+ hasil);
        } else if (operator == '/') {
            hasil = a / b;
            System.out.println("hasil = " + hasil);

        }

    }
}
