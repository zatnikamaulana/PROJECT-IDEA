package com.tutorial;

public class Main {
    public static void main (String[] args){
        //operator logika
        //or
        boolean a,b,c;
        System.out.println("====== OR =======");
        a = true;
        b = true;
        c = (a || b );
        System.out.println(a + "||" + b + "="+ c);
        a = true;
        b = false;
        c = (a || b );
        System.out.println(a + "||" + b + "="+ c);
        a = false;
        b = true;
        c = (a || b );
        System.out.println(a + "||" + b + "="+ c);
        a = false ;
        b = false;
        c = (a || b );
        System.out.println(a + "||" + b + "="+ c);

        //and logic
        System.out.println("====== and =======");
        a = true;
        b = true;
        c = (a && b );
        System.out.println(a + "&&" + b + "="+ c);
        a = true;
        b = false;
        c = (a && b );
        System.out.println(a + "&&" + b + "="+ c);
        a = false;
        b = true;
        c = (a && b );
        System.out.println(a + "&&" + b + "="+ c);
        a = false ;
        b = false;
        c = (a && b );
        System.out.println(a + "&&" + b + "="+ c);
        // xor logic

        System.out.println("====== XOR =======");
        a = true;
        b = true;
        c = (a ^ b );
        System.out.println(a + "^" + b + "=" + c);
        a = true;
        b = false;
        c = (a ^ b );
        System.out.println(a + "^" + b + "=" + c);
        a = false;
        b = true;
        c = (a ^ b );
        System.out.println(a + "^" + b + "=" + c);
        a = false ;
        b = false;
        c = (a ^ b );
        System.out.println(a + "^" + b + "=" + c);

        //NOT ----> flipping
        System.out.println("==========NEGASI========");
        a = false;
        c = !a;
        System.out.println(a + "----> (!)"+ c);


        boolean z,y;
        z = true;
        y = !z;
        System.out.println(z+"--->(!)"+ y);

    }
}
