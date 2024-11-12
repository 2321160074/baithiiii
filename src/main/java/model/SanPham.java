/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author nguye
 */
public class SanPham {
    private int MaSP;
    private String TenSP;
    private float DonGia;
    private int MaLoai;
    private int macd;
    private String Hinh;
    private Date ngaycapnhat;

    public SanPham() {
    }

    public SanPham(int MaSP, String TenSP, float DonGia, String Hinh, int MaLoai,int macd , Date ngaycapnhat) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.MaLoai = MaLoai;
        this.macd=macd;
        this.Hinh = Hinh;
        this.ngaycapnhat = ngaycapnhat;
    }

    public int getMasach() {
        return MaSP;
    }

    public void setMasach(int masach) {
        this.MaSP = masach;
    }

    public String getTensach() {
        return TenSP;
    }

    public void setTensach(String tensach) {
        this.TenSP = tensach;
    }

    public float getDongia() {
        return DonGia;
    }

    public void setDongia(int dongia) {
        this.DonGia = dongia;
    }

        public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public int getManxb() {
        return MaLoai;
    }

    public void setManxb(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String hinh) {
        this.Hinh = Hinh;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + MaSP + ", tensp=" + TenSP + ", dongia=" + DonGia + ", maloai=" + MaLoai + ", hinh=" + Hinh + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
    
}
