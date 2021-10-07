package com.trungbq2004110026.tuan02;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
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
    
}