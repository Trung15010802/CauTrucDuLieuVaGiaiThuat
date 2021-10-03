package com.trungbq2004110026.tuan04.BaiTapThem;

import java.util.Scanner;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    double dungTichXang;
    Scanner sc = new Scanner(System.in);
    void nhapThongTin(){
        System.out.println("Tên chủ xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        hangSanXuat = sc.nextLine();
        System.out.println("Nhập dòng xe: ");
        dong = sc.nextLine();
        System.out.println("Nhập giấy phép: ");
        giayPhep = sc.nextLine();
        System.out.println("Nhập dung tích xăng: ");
        dungTichXang = sc.nextDouble();
        sc.nextLine();

    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Hãng sản xuất: "+hangSanXuat);
        System.out.println("Dòng: "+ dong);
        System.out.println("Dung tích xăng: "+dungTichXang);
    }
}
