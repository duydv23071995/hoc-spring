package com.example.quanlysinhvien.Repo;

import com.example.quanlysinhvien.Entity.SinhVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISinhVienRepo extends JpaRepository<SinhVienEntity,Integer> {
    @Query(value = "select o from SinhVienEntity o where o.maSinhVien = ?1 and o.diem >?2")
    SinhVienEntity getSinhVienTheoMaSinhVien(String maSinhVien,double diem);
    @Query(value = "select o from SinhVienEntity o where o.maSinhVien =:maSinhVien and o.diem >:diem")
    SinhVienEntity getSinhVienTheoMaSinhVienC2(@Param("maSinhVien") String maSinhVien, @Param("diem")double diem);
    @Query(value = "select o from SinhVienEntity o  ")
    List<SinhVienEntity> getALLSinhVien();

    @Query(value = "select o from SinhVienEntity o where o.maSinhVien = :maSinhVien")
    SinhVienEntity getSinhVien(@Param("maSinhVien") int sinhVien);


}
