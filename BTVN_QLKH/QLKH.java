package BTVN_QLKH;

import BTVN_QLKH.KhachHangList;

import java.util.Scanner;

public class QLKH {
    public static void main(String[] args) {
        KhachHangList listKH=new KhachHangList();
        Scanner sc=new Scanner(System.in);
        int x;
        //su dung vong lap hien thi va thuc hien chuc nang
        do {
            System.out.println("1:them kh Viet");
            System.out.println("2: them kh nuoc ngoai");
            System.out.println("3:hien thi ds kh");
            x=sc.nextInt();
            switch (x){
                case 1:
                    listKH.themKh(1);
                    break;
                case 2:
                    listKH.themKh(2);
                case 3:
                    listKH.HienThi();
                    break;
            }
        }while (x!=0);
    }
}
