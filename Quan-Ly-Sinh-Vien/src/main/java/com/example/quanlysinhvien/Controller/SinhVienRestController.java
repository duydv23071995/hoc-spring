package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.Entity.SinhVienEntity;
import com.example.quanlysinhvien.Repo.ISinhVienRepo;
import com.example.quanlysinhvien.mode.common.ResponesComon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sinh-vien")
public class SinhVienRestController {
    @Autowired
    private ISinhVienRepo sinhVienRepo;

    @GetMapping("get-all")
    public List<SinhVienEntity> getAll(){
        return sinhVienRepo.getALLSinhVien();
    }

    @PostMapping(value = "save")
    public ResponesComon<SinhVienEntity> save(@RequestBody  SinhVienEntity input){
        ResponesComon<SinhVienEntity> responesComon = new ResponesComon<>();
        responesComon.setStatus("That bai");

        // kiểm tra input có hợp lệ hay không
        if (input.getTenSinhVien() == null || "".equals(input.getTenSinhVien())){
            responesComon.setError("Bạn không nhập tên vui lonòng nhaap ten");
            return responesComon;
        }
        if(input.getDiem() < 0 || input.getDiem()>10){
            responesComon.setError(" vui long nhap diem tu 0 den 10");
            return responesComon;
        }

        // kiêm tra sinh đã có chưa
        SinhVienEntity kiemTraSInhVienTonTaiHayKhong = sinhVienRepo.getSinhVien(input.getMaSinhVien());
        if(kiemTraSInhVienTonTaiHayKhong != null){
            responesComon.setError("Sinh vien co má " + input.getMaSinhVien() + " đã tồn tai vui lòng thêm sinh khác");
            return responesComon;
        }
        SinhVienEntity data = null;
        try {
             data = sinhVienRepo.save(input);
        }catch (Exception e){
           responesComon.setError("THêm thất bại");
           return responesComon;
        }
        responesComon.setStatus("Thành công");
        responesComon.setData(data);

        return responesComon;
    }
}
