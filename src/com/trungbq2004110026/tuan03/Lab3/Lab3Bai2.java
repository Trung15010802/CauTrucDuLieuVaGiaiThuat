package com.trungbq2004110026.tuan03.Lab3;

public class Lab3Bai2 {
    public static void main(String[] args) {
        System.out.println("BẢNG CỬU CHƯƠNG");
        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= 9;j++){
                System.out.printf("|%2d x %d =%2d  ",i ,j ,i*j);
                //System.out.println();
            }
            System.out.println();
        }
    }
}
