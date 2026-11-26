import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner inputUser;
        float a,b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("masukan nilai A = ");
        a = inputUser.nextFloat();
        System.out.print("masukan operator = ");
        operator = inputUser.next();
        System.out.print("Masukan Nilai B = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("hasil = "+ hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasil = "+hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("hasil = "+hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("hasil = "+hasil);
                break;
        }





    }
}
