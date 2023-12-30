package com.example.quanlysinhvien.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity {
    @Id
    @Column(name = "MA_NHAN_vIEN")
    private String maNhanVien;

    @Column(name = "TEN_NHAN_VIEN")
    private String tenNhanVien;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Column(name = "LUONG")
    private float luong;


}
