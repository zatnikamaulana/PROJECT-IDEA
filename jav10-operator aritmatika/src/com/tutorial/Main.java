package com.tutorial;

public class Main {
    public  static void main(String[] args){
        //operasi aritmatika
        int variabel1 = 11;
        int variabel2 = 2;
        int hasil;
        //1. penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println( variabel1 +"+"+ variabel2 + "=" + hasil);

        //2. pengurangan
        hasil = variabel1 - variabel2;
        System.out.println( variabel1 +"-"+ variabel2 + "=" + hasil);
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil );

        //3. perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1,variabel2,hasil );

        //4. pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil );

        float x = 28;
        float y = 3;
        float hasilFloat;
        hasilFloat = x/y;
        System.out.println(x + "/" + y + "=" + hasilFloat);

        //5. modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil );
    }
}

