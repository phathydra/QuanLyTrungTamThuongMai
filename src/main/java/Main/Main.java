package Main;

import java.util.List;
import java.util.Scanner;

import Controller.MatBangController;
import Controller.NhanVienController;
import Model.MatBang;

public class Main {
    public static void main(String[] args) {
        NhanVienController nv = new NhanVienController();
        MatBangController mb = new MatBangController();
        Scanner sc = new Scanner(System.in);
        boolean tiepTuc = true;

        do {
            System.out.println("Lựa chọn:");
            System.out.println("1. Thêm giao dịch đất.");
            System.out.println("2. Thêm giao dịch nhà.");
            System.out.println("3. In tất cả các giao dịch.");
            System.out.println("4. Xoá giao dịch.");
            System.out.println("5. Xoá thông tin nhân viên.");
            System.out.println("6. Trung bình thành tiền của giao dịch đất.");
            System.out.println("7. Tìm kiếm giao dịch bằng năm giao dịch.");
            System.out.println("8. Thêm mặt bằng.");
            System.out.println("9. Sửa mặt bằng.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("\nHãy nhập lựa chọn của bạn:");
            int luaChon = sc.nextInt();

            switch (luaChon) {
                case 1: {
                    System.out.println("\n---------- Thêm giao dịch đất ----------");

                    break;
                }
                case 2: {
                    System.out.println("\n---------- Thêm giao dịch nhà ----------");

                    break;
                }
                case 3: {
                    System.out.println("\n---------- Tất cả các giao dịch ----------");

                    break;
                }
                case 4: {
                    System.out.println("\n---------- Xoá giao dịch ----------");

                    break;
                }
                case 5: {
                    System.out.println("\n---------- Xoá thông tin nhân viên ----------");
                    nv.layDanhSachNhanVien(3);
                    break;
                }
                case 6: {
                    System.out.println("\n---------- Trung bình thành tiền của giao dịch đất ----------");

                    break;
                }
                case 7: {
                    System.out.println("\n---------- Tìm kiếm giao dịch bằng năm giao dịch ----------");

                    break;
                }
                case 8: {
                    boolean tiepTucThem = true;
                    do {
                        System.out.println("\n---------- Menu Thêm mặt bằng ----------");
                        System.out.println("1. Thêm mặt bằng");
                        System.out.println("0. Thoát");
                        System.out.print("\nHãy nhập lựa chọn của bạn:");
                        int chon = sc.nextInt();
                        switch (chon) {
                            case 1: {
                                System.out.println("\n---------- Thêm mặt bằng ----------");
                                System.out.print("Nhập địa chỉ: ");
                                sc.nextLine(); // Consume newline character
                                String diaChi = sc.nextLine();
                                
                                // Check if the address already exists in the database
                                boolean addressExists = mb.kiemTraDiaChiTonTai(diaChi);
                                if (addressExists) {
                                    System.out.println("Địa chỉ đã tồn tại trong cơ sở dữ liệu. Vui lòng chọn địa chỉ khác.");
                                    break;
                                }
                                
                                System.out.print("Nhập diện tích: ");
                                String dienTich = sc.nextLine();
                                System.out.print("Nhập loại hình kinh doanh: ");
                                String loaiHinhKinhDoanh = sc.nextLine();
                                System.out.print("Nhập giá thuê: ");
                                double giaThue = sc.nextDouble();
                                mb.themMatBang(diaChi, dienTich, loaiHinhKinhDoanh, giaThue);
                                System.out.println("Đã thêm mặt bằng '" + diaChi + "' diện tích '" + dienTich + "', loại hình '" + loaiHinhKinhDoanh + "', giá thuê '" + giaThue + "' thành công!");
                                break;
                            }
                            case 0: {
                                tiepTucThem = false;
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
                                break;
                            }
                        }
                    } while (tiepTucThem);
                    break;
                }

                case 9: {
                    System.out.println("\n---------- Danh sách các mặt bằng ----------");
                    List<MatBang> danhSachMatBang = mb.layDanhSachMatBang();
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
                            case 1: {
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
                                    break;
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
                                    break;
                                }
                                
                                System.out.print("Nhập diện tích mới: ");
                                String dienTich = sc.nextLine();
                                System.out.print("Nhập loại hình kinh doanh mới: ");
                                String loaiHinhKinhDoanh = sc.nextLine();
                                System.out.print("Nhập giá thuê mới: ");
                                double giaThue = sc.nextDouble();
                                mb.capNhatMatBang(id, diaChiMoi, dienTich, loaiHinhKinhDoanh, giaThue);
                                System.out.println("Đã sửa thông tin mặt bằng có ID " + id + " thành: Địa chỉ: " + diaChiMoi + ", Diện tích: " + dienTich + ", Loại hình kinh doanh: " + loaiHinhKinhDoanh + ", Giá thuê: " + giaThue);
                                break;
                            }
                            case 0: {
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không hợp lệ.");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 0:
                    System.out.println("Thoát chương trình.");
                    tiepTuc = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Hãy nhập lựa chọn khác.");
            }


        } while (tiepTuc);
    }
}
