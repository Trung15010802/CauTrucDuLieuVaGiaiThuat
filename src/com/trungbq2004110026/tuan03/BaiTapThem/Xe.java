package com.trungbq2004110026.tuan03.BaiTapThem;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    double dungTichXang;
    Xe(){
        tenChuXe = "Bùi Quang Trung";
        hangSanXuat = "HonDa";
        dong = "Xe tay côn";
        giayPhep = "giấy phép thân thiện với môi trường";
        dungTichXang = 6;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Hãng sản xuất: "+hangSanXuat);
        System.out.println("Dòng: "+ dong);
        System.out.println("Dung tích xăng: "+dungTichXang);
    }
}
