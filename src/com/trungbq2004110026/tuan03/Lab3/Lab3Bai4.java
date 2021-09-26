package com.trungbq2004110026.tuan03.Lab3;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần nhập thông tin: ");
        int n = sc.nextInt();
        double diem[] = new double[n];
        String hoTen[] = new String[n];
        for(int i = 0;i < n;i++){
            sc.nextLine();
            System.out.printf(">>Nhập họ tên sinh viên thứ %d: ", i+1);
            hoTen[i] = sc.nextLine();
            System.out.printf("Nhập điểm sinh thứ %d: ", i+1);
            diem[i] = sc.nextDouble();
        }
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(diem[i] > diem[j]){
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;
                    String temp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = temp;
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(diem[i] >= 9){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực xuất sắc!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 7.5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực giỏi!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 6.5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực khá!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực trung bình!", hoTen[i], diem[i]);
            }
            else{
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực yếu!", hoTen[i], diem[i]);
            }   
        }
        sc.close();
    }
}
