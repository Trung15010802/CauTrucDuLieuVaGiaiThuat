package com.trungbq2004110026.tuan03.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            System.out.printf("A[%d]= ", i);
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0;i < n;i++){
            System.out.println();
            System.out.printf("A[%d]= %d", i,a[i]);    
        }
        int Min = a[0];
        for(int x : a){
            Math.min(Min, x);
        }
        System.out.println("\n\nPhần tử nhỏ nhất trong mảng là: " + Min);
        int tong = 0;
        int dem = 0;
        for(int x : a){
            if(x % 3 == 0){
                tong += x;
                dem++;
            }      
        }
        System.out.printf("\nTrung bình cộng các số chia hết cho 3 = %d", tong/dem);
        sc.close();  
    }  
    
}
