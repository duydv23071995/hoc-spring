package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.Entity.NhanVienEntity;
import com.example.quanlysinhvien.Repo.INhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Nhan_Vien")
public class NhanVienController {
    @Autowired
    private INhanVienRepo iNhanVienRepo;
    @GetMapping(value = "get-all")
    public List<NhanVienEntity> getAll(){
        return iNhanVienRepo.getAll();
    }
}
