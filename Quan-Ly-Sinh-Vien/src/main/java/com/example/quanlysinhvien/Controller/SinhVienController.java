package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.Entity.SinhVienEntity;
import com.example.quanlysinhvien.Repo.ISinhVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SinhVienController {
    @Autowired
    private ISinhVienRepo sinhVienRepo;


    @GetMapping(value = "quan-li-sinh-vien")
    public String getAll(Model model) {
        List<SinhVienEntity> sinhVienEntityList = sinhVienRepo.getALLSinhVien();
        model.addAttribute("listSinhVien", sinhVienEntityList);
        return "QuanLySinhVien";
    }
    @GetMapping(value = "them-sinh-vien")
    public String viewSave(){
        return "sinhvien/them-sinh-vien";
    }



}
