package com.trungbq2004110026.tuan03.Lab3;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số: ");
        int n = sc.nextInt();
        boolean ok = true;
        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                ok = false;
                break;
            }
        }
        if(ok == true)
            System.out.println(n + " là số nguyên tố !");
        else System.out.println(n + " không phải số nguyên tố !");    
        sc.close();
    }
    
}
