package com.tutorial;

public class Test {
    public static void main(String[]args){

//        while(kondisi){
//            aksi
//        }
        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");
        while (kondisi){
            System.out.println("anak ke - " + a);
            if (a == 20){
                kondisi = false;
            }
            a++;

        }
        System.out.println("akhir dari program");
    }
}
