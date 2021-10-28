package com.company;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d, r, s, lvl = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        a = scan.nextInt();
        System.out.println("b = ");
        b = scan.nextInt();
        System.out.println("c = ");
        c = scan.nextInt();
        System.out.println("d = ");
        d = scan.nextInt();

        r = stupid_dobutok(a, c) - stupid_dobutok(b, d);
        s = stupid_dobutok(a, d) + stupid_dobutok(c, b);

        System.out.println("(" + a + " + " + b + "i)" + "(" + c + " + " + d + "i) = "
                + r + " + " + s + "i\n");

        System.out.println("lvl = " + lvl + "\n");
        System.out.println("deep = " + (lvl + 1) + "\n");
    }

    public static int t_size(int n) {
        int tt = 0;
        while (n > 0){
            tt++;
            n /= 10;
        }
        return tt;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int stupid_dobutok(int A, int B){
        if (A < 10 && B < 10)
            return A * B;

        int size = max(t_size(A), t_size(B));

        int n = (int) (size / 2.0);
        int p = (int) pow(10, n);
        int a = (int)(A / p);
        int b = (int)A % p;
        int c = (int)(B / p);
        int d = B % p;

        int d0 = stupid_dobutok(a, c);
        int d1 = stupid_dobutok(b, d);
        int d2 = stupid_dobutok(a + b, c + d) - d0 - d1;

        return (int) (pow(10 , 2 * n) * d0 + pow(10 , n) * d2 + d1);
    }

}