package com.example.quanlysinhvien.Repo;

import com.example.quanlysinhvien.Entity.NhanVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INhanVienRepo  extends JpaRepository<NhanVienEntity,String> {
   @Query(value = "select o from NhanVienEntity o")
    List<NhanVienEntity> getAll();
}
