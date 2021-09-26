package com.trungbq2004110026.tuan03.BaiTapThem;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    int ram;
    String cpu;
    double gia;
    int namBaoHanh;
    MayTinh(){
        nhaSanXuat = "Intel";
        namSanXuat = 2021;
        heDieuHanh = "Windows 11";
        ram = 16;
        cpu = "Intel Core i7 12000";
        gia = 300000;
        namBaoHanh = 2;
    }
    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("Ram: "+ram);
        System.out.println("Giá tiền: "+gia);
        System.out.println("Số năm bảo hành: "+namBaoHanh);
    }
}
