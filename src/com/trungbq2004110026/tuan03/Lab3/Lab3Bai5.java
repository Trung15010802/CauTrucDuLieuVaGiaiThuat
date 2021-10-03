package com.trungbq2004110026.tuan03.Lab3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab3Bai5 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int soSinhVien = sc.nextInt();
       SinhVien sinhVien[] = new SinhVien[soSinhVien];
        for(int i = 0;i < soSinhVien;i++){
            sinhVien[i] = new SinhVien();
            System.out.printf(">>Nhập thông tin sinh viên thứ %d: ",i+1 );           
            sinhVien[i].nhapThongTin();
        }
        //  for(int i = 0;i < sinhVien.length;i++){
        //     System.out.println("\n>>Thông tin sinh viên "+ (i+1));
        //     sinhVien[i].xuatThongTin();
        // } 
        List<SinhVien> list = Arrays.asList(sinhVien);
        Comparator <SinhVien> comp = new Comparator<SinhVien>(){

            @Override
            public int compare(SinhVien o1, SinhVien o2) {               
                return Integer.compare(o1.tuoi, o2.tuoi);
            }   
        };
        list.sort(comp);
         for(int i = 0;i < sinhVien.length;i++){
            System.out.println("\n>>Thông tin sinh viên "+ (i+1));
            sinhVien[i].xuatThongTin();
        } 
        sc.close();
    }
}
