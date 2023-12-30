package com.example.quanlysinhvien.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sinh_vien")
public class SinhVienEntity {
    @Id
    @Column(name = "MA_SINH_VIEN")
    private int maSinhVien;
    @Column(name = "TEN_SINH_VIEN")
    private String tenSinhVien;
    @Column(name = "DIEN")
    private double diem;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
