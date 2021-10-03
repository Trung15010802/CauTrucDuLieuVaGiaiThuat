package com.trungbq2004110026.tuan04.BaiTapThem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soXe = sc.nextInt();
        Xe xe[] = new Xe[soXe];
        for(int i = 0;i < soXe;i++){
            xe[i] = new Xe();
            System.out.printf(">>Nhập thông tin sinh viên thứ %d: ",i+1 );           
            xe[i].nhapThongTin();
        }
        List <Xe> list =  Arrays.asList(xe);
        //Nhập thêm nhân viên
        System.out.println("Thêm xe : ");
        while(true){
            Xe xe2 = new Xe();
            xe2.nhapThongTin();
            list.add(xe2);
            if(sc.nextLine().equals("n"))
                break;
        }
        //In thông tin nhân viên
        for (Xe x : list) {
            x.inThongTin();
        }
        //Xoá nhân viên
        System.out.print("Nhập tên cần xoá: ");
        String name = sc.nextLine();
        for (Xe a : list) {
            if((a.tenChuXe).equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }
        // In thông tin nhân viên
        for (Xe x : list) {
            x.inThongTin();
        }
        sc.close();
    }
}
