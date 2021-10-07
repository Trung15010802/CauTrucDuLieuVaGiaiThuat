package com.trungbq2004110026.tuan02;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        int soDien;
        System.out.print("Nhập số điện: ");
        Scanner sc = new Scanner(System.in);
        soDien = sc.nextInt();
        if(soDien <= 50 & soDien >= 0) System.out.printf("Số tiền là: %.2f", soDien*1000);
        else System.out.printf("Số tiền là: %.2f", 50*1000 + (soDien - 50)*1200);
        sc.close();
    }
}
