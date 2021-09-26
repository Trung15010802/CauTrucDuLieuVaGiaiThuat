package com.trungbq2004110026.tuan03.BaiTapThem;

public class NhanVien {
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    NhanVien(){
        tenNhanVien = "Bùi Quang Trung";
        luong = 100000000;
        diaChi = "Thành Phố Hồ Chí Minh";
        boPhanLamViec = "Giám đốc";
        ngaySinh = "8/2/2002";
    }
    void inThongTin(){
        System.out.println("Tên: "+tenNhanVien);
        System.out.println("Lương:"+luong);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhanLamViec);
        System.out.println("Ngày sinh: "+ngaySinh);
    }
}
