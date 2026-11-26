package com.tutorial;

public class Main {
    public static void main(String[] args){
        //unary = operasi yang dilakukan dalam satu variable

        //unary + and -
        int angka = 2;
        System.out.printf("unary '-' %d menjadi %d\n",angka,-angka);
        System.out.printf("unary '-' %d menjadi %d\n",angka,+angka);

        //unary decrement and increment
        //increment
        int angka2 = 11;
        angka2++;
        angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);

        //decrement
        int angka3 = 11;
        angka3--;
        System.out.println("Nilai dengan '++' menjadi = " + angka3);

        //prefix and postfix

        int a = 6;
        System.out.printf("Nilai dengan '++' prefix menjadi = %d \n",++a);

        int b = 6;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n ", b++);
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n ", b);
    }
}
