package com.trungbq2004110026.tuan04.Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab4bai3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <SanPham> list = new ArrayList<SanPham>();
    static void nhap(){
        while(true){
            SanPham sanPham = new SanPham();
            sanPham.nhapThongTin();
            list.add(sanPham);
            System.out.print("Nhập thêm (y/n)?: ");
            if(sc.nextLine().equals("n"))
                break;
        }
    }
    static void xuat(){
        for (SanPham a : list){
            a.xuatThongTin();
        }
    }
    static void sapXepGiamDan(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        xuat();   
    }
    static void xoa(){
        System.out.print("Nhập tên cần xoá: ");
        String name = sc.nextLine();
        for (SanPham a : list) {
            if((a.ten).equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }    
    }
    static void tinhTrungBinh(){
        double tong = 0;
        double trungBinh = 0;
        for (SanPham x : list) {
            tong += x.donGia;
        }
        trungBinh = tong/list.size();
        System.out.println("Giá trung bình của các sản phẩm là: "+trungBinh);
    }
    static void menu(){
        System.out.println(" ____________________MENU____________________");
        System.out.println("|>>1. Nhập sản phẩm.                         |");
        System.out.println("|>>2. Xuất danh sách.                        |");
        System.out.println("|>>3. Sắp xếp giảm dần theo giá.             |");
        System.out.println("|>>4. Tìm và xoá sản phẩm.                   |");
        System.out.println("|>>5. Xuất giá trung bình của các sản phẩm.  |");
        System.out.println("|>>6. Kết thúc!                              |");
        System.out.println("|____________________________________________|");
        System.out.print("Mời bạn chọn: ");
        int key = sc.nextInt();
        sc.nextLine();
        switch(key){
            case 1:
                clearScreen();
                System.out.println("_______Nhập sản phẩm_______");
                nhap();
                break;
            case 2:
                clearScreen();
                System.out.println("_______Xuất danh sách sản phẩm_______");
                xuat();
                break;
            case 3:
                clearScreen();
                System.out.println("_______Sắp xếp sản phẩm giảm dần theo giá_______");
                sapXepGiamDan();
                break;
            case 4:
                clearScreen();
                System.out.println("_______Tìm và xoá sản phẩm_______"); 
                xoa();
                break;
            case 5:
                clearScreen();
                System.out.println("_______Xuất giá trung bình của các sản phẩm_______");
                tinhTrungBinh();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Lựa chọn sai !");    
        }    
    }   
    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void main(String[] args) {
        do {
            clearScreen();
            menu();
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        } while(sc.nextLine().equals("y"));
    } 
}
