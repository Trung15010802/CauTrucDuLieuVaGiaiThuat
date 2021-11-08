package com.trungbq2004110026.kiemtragiuakylan2;

import java.util.Scanner;

public class Book {
    int id;
    double donGia;
    int soLuong;

    public Book() {
    }
    
    public Book(int i, double d, int s){
        i = id;
        d = donGia;
        s = soLuong;
    }

    Scanner sc = new Scanner(System.in);

    void nhapThongTin(){
        System.out.print("Nhập mã: ");
        id = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();

    }

    void inThongTin(){
        System.out.println("___________________________");
        System.out.println("Mã: "+id);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Số Lượng: "+soLuong);
        System.out.println("___________________________");
    }

}
