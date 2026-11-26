package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void  main(String[]args){
        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas;

        //int input = userInput.nextInt();
        //System.out.println("Input dari user = " + input);
        System.out.println("Menghitung Luas");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("luas nya adalah ="+luas);


    }
}
