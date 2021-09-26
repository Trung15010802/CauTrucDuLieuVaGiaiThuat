package com.trungbq2004110026.tuan01.Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap diem TB: ");
        Double diemTb = sc.nextDouble();
        System.out.printf("%s %.2f diem", hoTen, diemTb);
        sc.close();
    }
    
}
