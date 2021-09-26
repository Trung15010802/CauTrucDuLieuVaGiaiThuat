package com.trungbq2004110026.tuan02.Lab2;

import java.util.Scanner;

public class Lab2Bai1{
    public static void main(String[] args) {
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
    
}