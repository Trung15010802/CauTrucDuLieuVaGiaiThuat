package com.trungbq2004110026.tuan04.Lab4;

import java.util.Scanner;

public class SanPham {
    String ten;
    double donGia;

    public SanPham() {
    }

    Scanner sc = new Scanner(System.in);

    void nhapThongTin() {
        System.out.print("Nhập tên sản phẩm: ");
        ten = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        donGia = sc.nextDouble();
    }

    void xuatThongTin() {
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Giá sản phẩm: " + donGia);
    }

}
