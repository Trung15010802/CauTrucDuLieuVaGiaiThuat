package com.trungbq2004110026.tuan03.Lab3;

import java.util.Scanner;

public class SinhVien {
    String MSSV;
    String hoTen;
    int tuoi;
    String queQuan;
    Scanner sc = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.print("\nNhập tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập MSSV: ");
        MSSV = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = sc.nextLine();
    }
    public void xuatThongTin(){
        System.out.println("Tên: "+ hoTen);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("MSSV: "+ MSSV);
        System.out.println("Quê Quán: "+queQuan);
    }
}   
