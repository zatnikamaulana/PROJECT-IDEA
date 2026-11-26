

public class Array {
    public static void main(String[]args){
        String[][] data = {
                {"eka", "zet", "abdi", "fauzil", "irsyad"},
                {"kucing", "babi", "anjing", "biawak"},
                {"anies", "ganjar", "prabowo"},
                {"langsat", "rambutan", "apel", "anggur"}
        };
        data[0][0] = "tauhid";

        System.out.println(data[0][0] + " pergi bersama " + data[1][0] + " ke rumah " + data[2][1] + " memakan " + data[3][2]);

    }
}
