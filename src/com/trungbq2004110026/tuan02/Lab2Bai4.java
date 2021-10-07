package com.trungbq2004110026.tuan02;

import java.util.Scanner;

public class Lab2Bai4 {
    static void giaiPTB1(){
        System.out.println("Nhập hệ số a và b: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0 ){
            if(b == 0) System.out.println("Phương trình vô số nghiệm!");
            else System.out.println("Phương trình vô nghiệm!");
        }
        else System.out.println("Phương trình có nghiệm là: " + -b/a);
        sc.close();
    }
    static void giaiPTB2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 he so cua phuong trinh bac 2: ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        double Delta = Math.pow(b, 2) - 4*a*c;
        System.out.println("Delta = " + Delta);
        if(a == 0){
            if(b == 0){
                if(c == 0) System.out.println("Phương trình vô số nghiệm!");
                else System.out.println("Phương trình vô nghiệm!");
            }
            else System.out.println("Phương trình có nghiệm là: " + -c/b);
        }
        else if(Delta == 0) System.out.println("Phương trình có nghiệp kép x1 = x2 = " + -b/2*a);
        else if(Delta >= 0)  System.out.printf("x1 = %.2f \nx2 = %.2f", (-b + Math.sqrt(Delta))/2*a, (-b - Math.sqrt(Delta))/2*a);
        else System.out.println("Phương trình vô nghiệm!");
        sc.close();
    }
    static void tinhTienDien(){
            int soDien;
            System.out.print("Nhập số điện: ");
            Scanner sc = new Scanner(System.in);
            soDien = sc.nextInt();
            if(soDien <= 50 & soDien >= 0) System.out.printf("Số tiền là: %.2f", soDien*1000);
            else System.out.printf("Số tiền là: %.2f", 50*1000 + (soDien - 50)*1200);
            sc.close();
    }
    public static void main(String[] args) {
        System.out.println("+--------------------------------+");
        System.out.println("1.	Giải phương trình bậc nhất");
        System.out.println("2.	Giải phương trình bậc 2");
        System.out.println("3.	Tính tiền điện");
        System.out.println("4.	Kết thúc");
        System.out.println("+--------------------------------+");
        System.out.println("Mời bạn chọn chức năng:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch(key){
            case 1 : 
                giaiPTB1();
                break;
            case 2 : 
                giaiPTB2();
                break;
            case 3 : 
                tinhTienDien();
                break;
            case 4 : 
            System.out.println("Kết thúc !");
            System.exit(0);
        }
        sc.close();
    }
    
}
