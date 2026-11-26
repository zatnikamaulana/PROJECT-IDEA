
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input dimensi matrik
            System.out.print("Masukkan jumlah baris matrik: ");
            int baris = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matrik: ");
            int kolom = scanner.nextInt();

            // Deklarasi dan inisialisasi matrik
            int[][] matrik = new int[baris][kolom];
            int[][] transposeMatrik = new int[kolom][baris];
            int[][] hasilPenjumlahan = new int[baris][kolom];

            // Input nilai elemen matrik
            System.out.println("\nInput nilai matrik:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Masukkan nilai baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                    matrik[i][j] = scanner.nextInt();
                }
            }

            // Hitung transpose matrik
            for (int i = 0; i < kolom; i++) {
                for (int j = 0; j < baris; j++) {
                    transposeMatrik[i][j] = matrik[j][i];
                }
            }

            // Hitung hasil penjumlahan matrik dengan transposenya
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasilPenjumlahan[i][j] = matrik[i][j] + transposeMatrik[i][j];
                }
            }

            // Tampilkan hasil
            System.out.println("\nMatrik Asli:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(matrik[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nMatrik Transpose:");
            for (int i = 0; i < kolom; i++) {
                for (int j = 0; j < baris; j++) {
                    System.out.print(transposeMatrik[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nHasil Penjumlahan:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(hasilPenjumlahan[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
