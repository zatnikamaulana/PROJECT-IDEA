package com.tutorial;
import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 5;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan Nilai Tebakan Anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai Tebakan Anda adalah " + nilaiTebakan);

        //operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.print("Angka Tebakan anda adalah = " + statusTebakan);


    }
}
