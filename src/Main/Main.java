package Main;

import java.util.Scanner;

import Controller.MatBangController;
import Controller.NhanVienController;

public class Main {
	public static void main(String[] args) {
		NhanVienController nv = new NhanVienController();
		MatBangController mb = new MatBangController();
		Scanner sc = new Scanner(System.in);
        boolean tiepTuc = true;
        
        do {
        	System.out.println("Lựa chọn:");
        	System.out.println("1. Thêm thông tin mặt bằng.");
        	System.out.println("2. Sửa thông tin mặt bằng.");
        	System.out.println("3. In tất cả các giao dịch.");
        	System.out.println("4. Xoá giao dịch.");
        	System.out.println("5. Xoá thông tin nhân viên.");
        	System.out.println("6. Thuê mặt bằng.");
        	System.out.println("7. Tìm kiếm giao dịch bằng năm giao dịch.");
        	System.out.println("0. Thoát chương trình.");
        	System.out.print("\nHãy nhập lựa chọn của bạn:");
        	int luaChon = sc.nextInt();
        	
        	switch (luaChon)
        	{
        	case 1:
        	{
        		mb.themThongTinMatBang();        		
        		break;
        	}
        	case 2:
        	{
        		mb.suaThongTinMatBang();
        		break;
        	}
        	case 3:
        	{
        		
        		break;
        	}
        	case 4:
        	{
        		System.out.println("\n---------- Xoá giao dịch ----------");
        		
        		break;
        	}
        	case 5:
        	{
        		System.out.println("\n---------- Xoá thông tin nhân viên ----------");
        		nv.layDanhSachNhanVien(3);
        		break;
        	}
        	case 6:
        	{
        		System.out.println("\n---------- Thuê mặt bằng ----------");
        		mb.thueMatBang(3);
        		break;
        	}
        	case 7:
        	{
        		System.out.println("\n---------- Tìm kiếm giao dịch bằng năm giao dịch ----------");
        		
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
