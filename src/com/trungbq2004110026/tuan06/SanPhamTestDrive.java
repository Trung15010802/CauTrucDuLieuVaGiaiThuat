package com.trungbq2004110026.tuan06;

import java.util.Scanner;
public class SanPhamTestDrive {
    static Scanner sc = new Scanner(System.in);
    static SanPham sanPham = new SanPham();
    static void nhap(SanPham ds[]){
        for(int i = 0;i < sanPham.soLuong;i++){
            ds[i] = new SanPham();
            ds[i].nhapThongTin();
        }
    }
    static void xuat(SanPham ds[]){
        for(int i = 0;i < sanPham.soLuong;i++) {
            ds[i].xuatThongTin();
        }
    }
    static void sapXepGiamdan(SanPham ds[]){
        for(int i = 0;i < sanPham.soLuong-1;i++){
            for(int j = i+1;j < sanPham.soLuong;j++){
                if(ds[i].donGia < ds[j].donGia){
                    SanPham temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
        xuat(ds);
    }
    static void tinhTrungBinh(SanPham ds[]){
        double tong = 0;
        double trungBinh = 0;
        for (SanPham x : ds) {
            tong += x.donGia;
        }
        trungBinh = tong/ds.length;
        System.out.println("Giá trung bình của các sản phẩm là: "+trungBinh);
    }
    static void timVaXoa(SanPham ds[]){
        System.out.print("- Nhập tên sản phẩm muốn xóa: ");
        String tenXoa = sc.nextLine();
        for(int i = 0;i <sanPham.soLuong;i++){
            if((ds[i].ten).equals(tenXoa)){
                for(int j = i;j < sanPham.soLuong - 1;j++){
                    ds[j] = ds[j + 1];
                }
            }
        }
        System.out.println("- Xóa thành công!");
        sanPham.soLuong--;
    }
    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void main(String[] args) {
        clearScreen();
        System.out.print("Nhập số sản phẩm: ");
        sanPham.soLuong = sc.nextInt();
        SanPham ds[] = new SanPham[sanPham.soLuong];
        do{
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
                    nhap(ds);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("_______Xuất danh sách sản phẩm_______");
                    xuat(ds);
                    break;
                case 3:
                    clearScreen();
                    System.out.println("_______Sắp xếp sản phẩm giảm dần theo giá_______");
                    sapXepGiamdan(ds);
                    break;
                case 4:
                    clearScreen();
                    System.out.println("_______Tìm và xoá sản phẩm_______"); 
                    timVaXoa(ds);
                    xuat(ds);
                    break;
                case 5:
                    clearScreen();
                    System.out.println("_______Xuất giá trung bình của các sản phẩm_______");
                    tinhTrungBinh(ds);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !");    
            }
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        }while(sc.nextLine().equals("y"));
    }
}
