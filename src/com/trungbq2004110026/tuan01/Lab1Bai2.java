package com.trungbq2004110026.tuan01;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.println("Nhap 2 canh cua hinh chu nhat: ");
       double canh1 = sc.nextDouble();
       double canh2 = sc.nextDouble();
       System.out.println("Dien tich = " + canh1*canh2);
       System.out.println("Chu vi = " + (canh1+canh2)*2);
       System.out.println("Canh nho nhat la: " + Math.min(canh1, canh2));
       sc.close();
    }  
}
