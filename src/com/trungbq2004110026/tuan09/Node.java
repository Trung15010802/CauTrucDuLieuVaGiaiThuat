package com.trungbq2004110026.tuan09;

import java.util.Scanner;

public class Node {
    int id;
    double weight;
    String color;
    Node next;

    Scanner sc = new Scanner(System.in);

    public Node() {
    }

    public Node(int i, double w, String c){
        id = i;
        weight = w;
        c = color;
    } 

    void nhapThongTin(){
        System.out.print("Nhập mã số: ");
        id = sc.nextInt();
        System.out.print("Nhập cân nặng: ");
        weight = sc.nextDouble();
        System.out.print("Nhập màu sắc: ");
        sc.nextLine();
        color = sc.nextLine();
    }

    void inThongTin(){
        System.out.println("____________________________");
        System.out.println("Mã số: " + id);
        System.out.println("Cân nặng: " + weight);
        System.out.println("Màu sắc: " + color);
        System.out.println("____________________________");

    }
}
