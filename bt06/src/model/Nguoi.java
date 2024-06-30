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
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String soCmnd;

    public Nguoi(String hoTen, int tuoi, String soCmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCmnd = soCmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", soCmnd=" + soCmnd + '}';
    }

    
}
  

