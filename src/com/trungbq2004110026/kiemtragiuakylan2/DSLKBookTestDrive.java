package com.trungbq2004110026.kiemtragiuakylan2;

import java.util.Scanner;


public class DSLKBookTestDrive {
    public static void main(String[] args) {
        DSLK dslk = new DSLK();
        Scanner sc = new Scanner(System.in);
        int key;
        do{
            System.out.println("----------MENU----------");
            System.out.println(">>1: Nhập thông tin book vào đầu.");
            System.out.println(">>2: Nhập thông tin book vào cuốI.");
            System.out.println(">>3: Xoá book đầu.");
            System.out.println(">>4: Xoá book cuối.");
            System.out.println(">>5: Thêm book vào trước book tìm được.");
            System.out.println(">>6: In danh sách liên kết.");
            System.out.println(">>7: Tìm kiếm sách trong dách sách.");
            System.out.println(">>8: Kết thúc.");
            System.out.print("- Nhập vào sựa lựa chọn: ");
    
            key = sc.nextInt();
            switch (key) {
            case 1:
                System.out.println(">>1: Nhập thông tin book vào đầu.");
                dslk.addFirst();
                break;
            case 2:
                System.out.println(">>2: Nhập thông tin book vào cuốI.");
                dslk.addLast();
                break;
            case 3:
                System.out.println(">>3: Xoá book đầu.");
                dslk.removeFirst();
                break;
            case 4:
                System.out.println(">>4: Xoá book cuối.");
                dslk.removeLast();
                break;
            case 5:
                System.out.println(">>5: Thêm book vào trước book tìm được.");
                dslk.addPreivous();
                break;
            case 6:
                System.out.println(">>6: In danh sách liên kết.");
                dslk.display();
                break;
            case 7:
                System.out.println(">>7: Tìm kiếm sách trong dách sách."); 
                int tim = sc.nextInt();
                if(dslk.find(tim) != null){
                    System.out.println("Sách có trong danh sách");
                }  
                else{
                    System.out.println("Không tìm thấy");
                }
                break;
            case 8:
                System.out.println("Chương trình kết thúc!");
                System.exit(0);
            }
            System.out.print("- Quay lại menu(1:yes/0:no): ");
            key = sc.nextInt();
        }
        while(key != 0);

    }
}
