package Main;

import java.util.Scanner;

import Controller.NhanVienController;

public class Main {
	public static void main(String[] args) {
		NhanVienController nv = new NhanVienController();
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
        	System.out.println("0. Thoát chương trình.");
        	System.out.print("\nHãy nhập lựa chọn của bạn:");
        	int luaChon = sc.nextInt();
        	
        	switch (luaChon)
        	{
        	case 1:
        	{
        		System.out.println("\n---------- Thêm giao dịch đất ----------");
        		
        		break;
        	}
        	case 2:
        	{
        		System.out.println("\n---------- Thêm giao dịch nhà ----------");
        		
        		break;
        	}
        	case 3:
        	{
        		System.out.println("\n---------- Tất cả các giao dịch ----------");
        		
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
        		System.out.println("\n---------- Trung bình thành tiền của giao dịch đất ----------");
        		
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
