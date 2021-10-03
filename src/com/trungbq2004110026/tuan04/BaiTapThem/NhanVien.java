package com.trungbq2004110026.tuan04.BaiTapThem;

import java.util.Scanner;

public class NhanVien {
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    Scanner sc = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.print("\nNhập tên: ");
        tenNhanVien = sc.nextLine();
        System.out.println("Nhập lương: ");
        luong = sc.nextDouble();
        System.out.println("Nhập địa chỉ: ");
        sc.nextLine();
        diaChi = sc.next();
        System.out.println("Nhập bộ phận làm việc: ");
        boPhanLamViec = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();

    }
    void inThongTin(){
        System.out.println("Tên: "+tenNhanVien);
        System.out.println("Lương:"+luong);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhanLamViec);
        System.out.println("Ngày sinh: "+ngaySinh);
    }
}
