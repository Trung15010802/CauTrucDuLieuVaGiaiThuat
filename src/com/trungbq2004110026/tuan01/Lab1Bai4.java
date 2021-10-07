package com.trungbq2004110026.tuan01;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 he so cua phuong trinh bac 2: ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        double Delta = Math.pow(b, 2) - 4*a*c;
        System.out.println("Delta = " + Delta);
        System.out.println("Can Delta = " + Math.sqrt(Delta));
        sc.close();
    }
}
