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
        int k=0;
        if ((a>=b)&&(a>=c)&&(a>=d)) {
            m=a;
        }
        if ((b>=a)&&(b>=c)&&(b>=d)) {
            m=b;
        }
        if ((c>=a)&&(c>=b)&&(c>=d)) {
            m=c;
        }
        if ((d>=a)&&(d>=b)&&(d>=c)) {
            m=d;
        }
        System.out.print("Наибольшее из четырех чисел: ");
        System.out.println(m);
        if (m==a){
            k=k+1;
        }if (m==b){
            k=k+1;
        }if (m==c){
            k=k+1;
        }if (m==d){
            k=k+1;
        }
        System.out.print("Количество максимальных чисел: ");
        System.out.println(k);
    }
}
