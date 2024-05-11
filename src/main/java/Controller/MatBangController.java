package Controller;

import java.util.List;
import java.util.Scanner;

import DAO.MatBangDAO;
import Model.MatBang;

public class MatBangController {

    private MatBangDAO matBangDao;
    private Scanner sc;

    public MatBangController() {
        matBangDao = new MatBangDAO();
        sc = new Scanner(System.in);
    }

    public void themMatBang() {
        System.out.println("\n---------- Menu Thêm mặt bằng ----------");
        System.out.println("1. Thêm mặt bằng");
        System.out.println("0. Thoát");
        System.out.print("\nHãy nhập lựa chọn của bạn:");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                themMatBangDetails();
                break;
            case 0:
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
                break;
        }
    }

    private void themMatBangDetails() {
        System.out.println("\n---------- Thêm mặt bằng ----------");
        System.out.print("Nhập địa chỉ: ");
        sc.nextLine(); // Consume newline character
        String diaChi = sc.nextLine();

        // Check if the address already exists in the database
        boolean addressExists = matBangDao.kiemTraDiaChiTonTai(diaChi);
        if (addressExists) {
            System.out.println("Địa chỉ đã tồn tại trong cơ sở dữ liệu. Vui lòng chọn địa chỉ khác.");
            return;
        }

        System.out.print("Nhập diện tích: ");
        String dienTich = sc.nextLine();
        System.out.print("Nhập loại hình kinh doanh: ");
        String loaiHinhKinhDoanh = sc.nextLine();
        
        double giaThue;
        do {
            System.out.print("Nhập giá thuê: ");
            giaThue = sc.nextDouble();
            if (giaThue < 0) {
                System.out.println("Giá thuê không được là số âm. Hãy nhập lại.");
            }
        } while (giaThue < 0);

        MatBang matBang = new MatBang(0, diaChi, dienTich, loaiHinhKinhDoanh, giaThue);
        matBangDao.themMatBang(matBang);
        System.out.println("Đã thêm mặt bằng '" + diaChi + "' diện tích '" + dienTich + "', loại hình '" + loaiHinhKinhDoanh + "', giá thuê '" + giaThue + "' thành công!");
    }

    public void suaMatBang() {
        System.out.println("\n---------- Danh sách các mặt bằng ----------");
        List<MatBang> danhSachMatBang = matBangDao.layDanhSachMatBang();
        if (danhSachMatBang.isEmpty()) {
            System.out.println("Không có mặt bằng nào trong hệ thống.");
        } else {
            System.out.println("Danh sách các mặt bằng trong hệ thống:");
            for (MatBang matBang : danhSachMatBang) {
                System.out.println("ID: " + matBang.getId() + ", Địa chỉ: " + matBang.getDiaChi() + ", Diện tích: " + matBang.getDienTich() + ", Loại hình kinh doanh: " + matBang.getLoaiHinhKinhDoanh() + ", Giá thuê: " + matBang.getGiaThue());
            }
            System.out.println("Lựa chọn:");
            System.out.println("1. Nhập mã mặt bằng cần sửa.");
            System.out.println("0. Thoát.");
            System.out.print("\nHãy nhập lựa chọn của bạn:");
            int luaChon1 = sc.nextInt();

            switch (luaChon1) {
                case 1:
                    suaMatBangDetails(danhSachMatBang);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    private void suaMatBangDetails(List<MatBang> danhSachMatBang) {
        System.out.print("Nhập ID mặt bằng cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean tonTai = false;
        for (MatBang matBang : danhSachMatBang) {
            if (matBang.getId() == id) {
                tonTai = true;
                break;
            }
        }

        if (!tonTai) {
            System.out.println("Không có mặt bằng nào có ID là " + id);
            return;
        }

        System.out.print("Nhập địa chỉ mới: ");
        String diaChiMoi = sc.nextLine();

        boolean diaChiTrung = false;
        for (MatBang matBang : danhSachMatBang) {
            if (matBang.getId() != id && matBang.getDiaChi().equalsIgnoreCase(diaChiMoi)) {
                diaChiTrung = true;
                break;
            }
        }

        if (diaChiTrung) {
            System.out.println("Địa chỉ mới trùng với địa chỉ đã có trong hệ thống.");
            return;
        }

        System.out.print("Nhập diện tích mới: ");
        String dienTich = sc.nextLine();
        System.out.print("Nhập loại hình kinh doanh mới: ");
        String loaiHinhKinhDoanh = sc.nextLine();

        double giaThue;
        do {
            System.out.print("Nhập giá thuê mới: ");
            giaThue = sc.nextDouble();
            if (giaThue < 0) {
                System.out.println("Giá thuê không được là số âm. Hãy nhập lại.");
            }
        } while (giaThue < 0);

        MatBang matBang = new MatBang(id, diaChiMoi, dienTich, loaiHinhKinhDoanh, giaThue);
        matBangDao.capNhatMatBang(matBang);
        System.out.println("Đã sửa thông tin mặt bằng có ID " + id + " thành: Địa chỉ: " + diaChiMoi + ", Diện tích: " + dienTich + ", Loại hình kinh doanh: " + loaiHinhKinhDoanh + ", Giá thuê: " + giaThue);
    }
}
