package com.trungbq2004110026.tuan04.Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4Bai1 {
    public static void main(String[] args) {
        ArrayList <Double> list = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhập số: ");
            double x = sc.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            sc.nextLine();
            if(sc.nextLine().equals("n"))
                break;
        }
        double tong = 0;
        for (Double x : list) {
            System.out.print(x+"    ");
            tong += x;
        }
        System.out.println("\nTổng = " + tong);
        sc.close();
    }
}
