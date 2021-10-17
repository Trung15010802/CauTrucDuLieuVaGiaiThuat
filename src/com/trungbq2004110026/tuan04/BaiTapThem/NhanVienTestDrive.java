package com.trungbq2004110026.tuan04.BaiTapThem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNhanVien = sc.nextInt();
        NhanVien nhanVien[] = new NhanVien[soNhanVien];
        for(int i = 0;i < soNhanVien;i++){
            nhanVien[i] = new NhanVien();
            System.out.printf(">>Nhập thông tin nhân viên thứ %d: ",i+1 );           
            nhanVien[i].nhapThongTin();
        }
       // List <NhanVien> list =  Arrays.asList(nhanVien);
        List<NhanVien> list = new ArrayList<NhanVien>(Arrays.asList(nhanVien));

        //Nhập thêm nhân viên
        System.out.println("Thêm nhân viên : ");
        while(true){
            NhanVien nhanVien2 = new NhanVien();
            nhanVien2.nhapThongTin();
            list.add(nhanVien2);
            if(sc.nextLine().equals("n"))
                break;
        }
        //In thông tin nhân viên
        for (NhanVien x : list) {
            x.inThongTin();
        }
        //Xoá nhân viên
        System.out.print("Nhập tên cần xoá: ");
        String name = sc.nextLine();
        for (NhanVien a : list) {
            if((a.tenNhanVien).equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }
        // In thông tin nhân viên
        for (NhanVien x : list) {
            x.inThongTin();
        }
        sc.close();
    }
}
