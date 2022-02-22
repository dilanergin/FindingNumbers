package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        System.out.println("4'ün kuvveti olan sayılar: ");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5'ün kuvveti olan sayılar: ");
        for (int j = 1; j <= number; j *= 5) {
            System.out.println(j);
        }


    }
}
