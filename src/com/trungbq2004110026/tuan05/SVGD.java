package com.trungbq2004110026.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class SVGD {
    String hoTen;
    Double diemTB;
    static ArrayList<SVGD> list = new ArrayList<SVGD>();
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        while (true) {
            SVGD sinhVien = new SVGD();
            System.out.print("Nhập họ và tên: ");
            sinhVien.hoTen = sc.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            sinhVien.diemTB = sc.nextDouble();
            list.add(sinhVien);
            sc.nextLine();
            System.out.print("Bạn có muốn tiếp tục (y/n): ");
            if (sc.nextLine().equals("n"))
                break;
        }
    }

    static void xuat() {
        for (SVGD x : list) {
            System.out.println("____________________________________________");
            System.out.println("Họ và tên: " + x.hoTen);
            System.out.println("Điểm trung bình: " + x.diemTB);
            System.out.println("____________________________________________");
        }
    }

    static void xuatDanhSachTheoKhoangDiem() {
        System.out.print("Nhập điểm min: ");
        Double min = sc.nextDouble();
        System.out.print("Nhập điểm max: ");
        Double max = sc.nextDouble();
        for (SVGD x : list) {
            if (x.diemTB >= min && x.diemTB <= max){
                System.out.println("____________________________________________");
                System.out.println("Họ và tên: " + x.hoTen);
                System.out.println("Điểm trung bình: " + x.diemTB);
                System.out.println("____________________________________________");
            }
        }
    }

    static void Tim() {
        for (SVGD x : list) {
            System.out.print("Nhập tên sinh viên cần tìm: ");
            if (sc.nextLine().equals(x.hoTen))
            System.out.println("____________________________________________");
            System.out.println("Họ và tên: " + x.hoTen);
            System.out.println("Điểm trung bình: " + x.diemTB);
            System.out.println("____________________________________________");
        }
    }

    static void Sua() {
        for (SVGD x : list) {
            System.out.print("Nhập tên sinh viên cần sửa: ");
            if (sc.nextLine().equals(x.hoTen)) {
                System.out.print("Nhập điểm mới: ");
                x.diemTB = sc.nextDouble();
                sc.nextLine();
            }
        }
    }

    static void Xoa() {
        for (SVGD x : list) {
            System.out.print("Nhập vào tên sinh viên cần xoá: ");
            if (sc.nextLine().equals(x.hoTen))
                list.remove(x);
        }
    }

    static void Menu() {
        System.out.println(" ____________________MENU____________________");
        System.out.println("|>>1. Nhập danh sách sinh viên.              |");
        System.out.println("|>>2. Xuất danh sách sinh viên.              |");
        System.out.println("|>>3. Sắp xếp theo khoảng điểm.              |");
        System.out.println("|>>4. Tìm 1 sinh viên.                       |");
        System.out.println("|>>5. Xoá 1 sinh viên.                       |");
        System.out.println("|>>6. Sửa 1 sinh viên.                       |");
        System.out.println("|>>7. Kết thúc!                              |");
        System.out.println("|____________________________________________|");
        System.out.print("Mời bạn chọn: ");
        int key = sc.nextInt();
        sc.nextLine();
        switch (key) {
            case 1:
                System.out.println(">> 1. Nhập danh sách sinh viên. <<");
                nhap();
                break;
            case 2:
                System.out.println(">> 2. Xuất danh sách sinh viên. <<");
                xuat();
                break;
            case 3:
                System.out.println(">> 3. Sắp xếp theo khoảng điểm. <<");
                xuatDanhSachTheoKhoangDiem();
                break;
            case 4:
                System.out.println(">> 4. Tìm 1 sinh viên. <<");
                Tim();
                break;
            case 5:
                System.out.println(">> 5. Xoá 1 sinh viên. <<");
                Xoa();
                break;
            case 6:
                System.out.println(">> 6. Sửa 1 sinh viên. <<");
                Sua();
                break;
            case 7:
                System.exit(0);
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        do {
            clearScreen();
            Menu();
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        } while (sc.nextLine().equals("y"));
    }
}
