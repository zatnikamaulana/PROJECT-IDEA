package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen-elemen matriks 3x3:");

        // Mengisi matriks dengan input dari pengguna
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan elemen [" + i + "][" + 0 + "]: ");
            matriks[i][0] = scanner.nextInt();
            System.out.print("Masukkan elemen [" + i + "][" + 1 + "]: ");
            matriks[i][1] = scanner.nextInt();
            System.out.print("Masukkan elemen [" + i + "][" + 2 + "]: ");
            matriks[i][2] = scanner.nextInt();
        }

        // Menampilkan matriks
        System.out.println("Matriks 3x3 yang diinput:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}
