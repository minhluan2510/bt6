/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.KhachSan;
import model.Nguoi;

/**
 *
 * @author luanq
 */
public class main {
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi("Nguyen Van A", 30, "123456789");
        Nguoi nguoi2 = new Nguoi("Le Thi B", 25, "987654321");
        KhachSan khachSan = new KhachSan();
        khachSan.themKhach(nguoi1, 3, 'A');
        khachSan.themKhach(nguoi2, 2, 'B');
        
        System.out.println(khachSan);
        System.out.println("Tiền thuê phòng của Nguyen Van A: " + khachSan.tinhTienThue("123456789"));
        khachSan.xoaKhach("987654321");
        System.out.println(khachSan);
    }
}
   
