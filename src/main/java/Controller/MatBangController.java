package Controller;

import java.util.LinkedList;
import java.util.List;

import DAO.MatBangDAO;
import Model.MatBang;

public class MatBangController {

    MatBangDAO matBangDao = new MatBangDAO();

    public List<MatBang> layDanhSachMatBang() {
        List<MatBang> matBangs = new LinkedList<>();
        matBangs = matBangDao.layDanhSachMatBang();
        return matBangs;
    }

    public void themMatBang(String diaChi, String dienTich, String loaiHinhKinhDoanh, double giaThue) {
        // Check if the address already exists
        if (kiemTraDiaChiTonTai(diaChi)) {
            System.out.println("Địa chỉ đã tồn tại trong cơ sở dữ liệu. Vui lòng chọn địa chỉ khác.");
            return;
        }

        MatBang matBang = new MatBang(0, diaChi, dienTich, loaiHinhKinhDoanh, giaThue);
        matBangDao.themMatBang(matBang);
    }

    public void capNhatMatBang(int id, String diaChi, String dienTich, String loaiHinhKinhDoanh, double giaThue) {
        MatBang matBang = new MatBang(id, diaChi, dienTich, loaiHinhKinhDoanh, giaThue);
        matBangDao.capNhatMatBang(matBang);
    }

    public boolean kiemTraDiaChiTonTai(String diaChi) {
        return matBangDao.kiemTraDiaChiTonTai(diaChi);
    }
}
