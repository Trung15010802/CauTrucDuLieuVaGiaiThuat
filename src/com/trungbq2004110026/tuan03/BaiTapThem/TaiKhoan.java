package com.trungbq2004110026.tuan03.BaiTapThem;

public class TaiKhoan {
    String tenChuTaiKhoan;
    int soTaiKhoan;
    double soDu;
    TaiKhoan(String tk, int soTK, double sd){
        tenChuTaiKhoan = tk;
        soTaiKhoan = soTK;
        soDu = sd;
    }
    void inThongTin(){
        System.out.println("Chủ tài khoản: "+tenChuTaiKhoan);
        System.out.println("Số tài khoản: "+soTaiKhoan);
        System.out.println("Số dư: "+soDu);
    }
}
