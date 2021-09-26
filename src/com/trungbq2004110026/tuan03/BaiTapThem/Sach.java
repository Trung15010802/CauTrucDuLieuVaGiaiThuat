package com.trungbq2004110026.tuan03.BaiTapThem;

public class Sach {
    double gia;
    String NXB;
    int namSanXuat;
    double giaBan;
    int soLuong;
    String loai;
    Sach(double g, String nxb, int nam, double gb, int sl, String l){
        gia = g;
        giaBan = gb;
        NXB = nxb;
        namSanXuat = nam;
        soLuong = sl;
        loai = l;
    }
    void inThongTin(){
        System.out.println("Giá: "+gia);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Nhà xuất bản: "+NXB);
        System.out.println("Năm Sản Xuất: "+namSanXuat);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Loại: "+loai);
    }
}
