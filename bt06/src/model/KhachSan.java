/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author luanq
 */
import java.util.ArrayList;

public class KhachSan {
    private ArrayList<Khach> khachHang;

    public KhachSan() {
        this.khachHang = new ArrayList<>();
    }

    public void themKhach(Nguoi nguoi, int soNgayThue, char loaiPhong) {
        if (loaiPhong != 'A' && loaiPhong != 'B' && loaiPhong != 'C') {
            throw new IllegalArgumentException("Loại phòng phải là A, B hoặc C");
        }
        Khach khach = new Khach(nguoi, soNgayThue, loaiPhong);
        khachHang.add(khach);
    }

    public boolean xoaKhach(String soCmnd) {
        for (Khach khach : khachHang) {
            if (khach.getNguoi().getSoCmnd().equals(soCmnd)) {
                khachHang.remove(khach);
                return true;
            }
        }
        return false;
    }

    public int tinhTienThue(String soCmnd) {
        for (Khach khach : khachHang) {
            if (khach.getNguoi().getSoCmnd().equals(soCmnd)) {
                int soNgayThue = khach.getSoNgayThue();
                char loaiPhong = khach.getLoaiPhong();
                int giaPhong = 0;
                switch (loaiPhong) {
                    case 'A':
                        giaPhong = 500;
                        break;
                    case 'B':
                        giaPhong = 300;
                        break;
                    case 'C':
                        giaPhong = 100;
                        break;
                }
                return soNgayThue * giaPhong;
            }
        }
        return -1; 
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Danh sách khách hàng:\n");
        for (Khach khach : khachHang) {
            result.append(khach.toString()).append("\n");
        }
        return result.toString();
    }

    private class Khach {
        private Nguoi nguoi;
        private int soNgayThue;
        private char loaiPhong;

        public Khach(Nguoi nguoi, int soNgayThue, char loaiPhong) {
            this.nguoi = nguoi;
            this.soNgayThue = soNgayThue;
            this.loaiPhong = loaiPhong;
        }

        public Nguoi getNguoi() {
            return nguoi;
        }

        public int getSoNgayThue() {
            return soNgayThue;
        }

        public char getLoaiPhong() {
            return loaiPhong;
        }

        @Override
        public String toString() {
            return nguoi.toString() + ", Số ngày thuê: " + soNgayThue + ", Loại phòng: " + loaiPhong;
        }
    }
}


