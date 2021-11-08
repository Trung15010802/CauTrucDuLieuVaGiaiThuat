package com.trungbq2004110026.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTestDrive {
    static ArrayList<Book> list = new ArrayList<Book>();
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        while (true) {
            Book book = new Book();
            book.nhapThongTin();
            list.add(book);
            System.out.print("Bạn có muốn tiếp tục (y/n): ");
            if (sc.nextLine().equals("n"))
                break;
        }
    }

    static void xuat() {
        for (Book x : list) {
            x.inThongTin();
        }
    }

    static void tim() {
        for (Book x : list) {
            System.out.print("Nhập giá sách cần tìm: ");
            if (sc.nextDouble() == x.donGia) {
                x.inThongTin();
                break;
            }
        }
    }

    static void menu() {
        System.out.println(" ____________________MENU____________________");
        System.out.println("|>>1. Nhập danh sách sách.                   |");
        System.out.println("|>>2. Xuất danh sách sách.                   |");
        System.out.println("|>>3. Tìm 1 sách theo mã.                    |");
        System.out.println("|>>4. Kết thúc!                              |");
        System.out.println("|____________________________________________|");
        System.out.print("Mời bạn chọn: ");
        int key = sc.nextInt();
        sc.nextLine();
        switch (key) {
        case 1:
            System.out.println("|>>1. Nhập danh sách sách.                   |");
            nhap();
            break;
        case 2:
            System.out.println("|>>2. Xuất danh sách sách.                   |");
            xuat();
            break;
        case 3:
            System.out.println("|>>3. Tìm 1 sách theo mã.                    |");
            tim();
            break;
        case 4:
            System.out.println("Chương trình kết thúc!");
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
            menu();
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        } while (sc.nextLine().equals("y"));
    }
    
         
}
