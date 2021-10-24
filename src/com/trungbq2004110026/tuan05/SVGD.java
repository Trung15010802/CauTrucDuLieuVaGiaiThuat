package com.trungbq2004110026.tuan05;

import java.util.Scanner;

public class SVGD {
    String hoTen;
    Double diemTB;

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.print("Nhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTB = sc.nextDouble();
    }

    public void xuatThongTin(){
        System.out.println("____________________________________________");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);
        System.out.println("____________________________________________");
    }
}
