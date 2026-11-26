import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> cars = new ArrayList<Integer>();
        int jumlahmobil = 0;

        while (true){
            System.out.print("Mobil ke-"+ (jumlahmobil + 1) + " : ");
            cars.add(scanner.next());
            scanner.next();
            System.out.print("Apakah Masih Ingin Menambah (Y/N)");
            String tambah = scanner.next().toLowerCase();

            if (tambah.equals("N"))
                break;
        }

        System.out.println("==================");
        System.out.println("Daftar Mobil");

        for (var mobil : cars){
            System.out.println(mobil);
        }
    }
}