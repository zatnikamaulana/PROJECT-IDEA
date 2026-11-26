import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> matriks = new ArrayList<>();

        ArrayList<Integer> baris1 = new ArrayList<>();
        baris1.add(1);
        baris1.add(2);
        baris1.add(3);

        matriks.add (baris1);

        ArrayList<Integer> baris2 = new ArrayList<>();
        baris2.add(4);
        baris2.add(5);
        baris2.add(6);

        matriks.add(baris2);
        ArrayList<Integer> baris3 = new ArrayList<>();
        baris2.add(7);
        baris2.add(8);
        baris2.add(9);

        matriks.add(baris3);

        for ( var baris : matriks){
            for(var anggota : baris){
                System.out.println(anggota + "\t");
            }
            System.out.println();
        }



    }
}
