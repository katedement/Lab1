package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a=in.nextInt();
        System.out.print("Введите число b: ");
        int b=in.nextInt();
        System.out.print("Введите число c: ");
        int c=in.nextInt();
        System.out.print("Введите число d: ");
        int d=in.nextInt();
        int m=0;
        if ((a<=b)&&(a<=c)&&(a<=d)) {
            m=a;
        }
        if ((b<=a)&&(b<=c)&&(b<=d)) {
            m=b;
        }
        if ((c<=a)&&(c<=b)&&(c<=d)) {
            m=c;
        }
        if ((d<=a)&&(d<=b)&&(d<=c)) {
            m=d;
        }
        System.out.print("Наименьшее из четырех чисел: ");
        System.out.println(m);
    }
}
