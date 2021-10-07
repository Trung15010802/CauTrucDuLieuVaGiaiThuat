package com.trungbq2004110026.tuan01;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh cua khoi lap phuong: ");
        Double canh = sc.nextDouble();
        System.out.print("The tich = " + Math.pow(canh, 3));
        sc.close();
    }
}
