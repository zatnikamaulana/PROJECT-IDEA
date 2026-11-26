import java.util.Scanner;
class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Penduduk penduduk = new Penduduk();
        
        penduduk.setNik(
                scanner.next()
        );

        System.out.println(penduduk.getNik());

    }
}

class Mahasiswa {
    String nim;
    String nama;
    public  Penduduk penduduk;

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNamaPenduduk(){
        return this.penduduk.nama;
    }
}

class Penduduk{
    String nik;
    String nama;

    public String getNik(){
        return this.nik;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

}
