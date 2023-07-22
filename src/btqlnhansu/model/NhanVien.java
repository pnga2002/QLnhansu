package btqlnhansu.model;

import java.util.Scanner;

public class NhanVien extends Person{
	private final Scanner scanner = new Scanner(System.in);
	
	public String tenQuanLy;
	private final String chucVu = "Nhân Viên";
    private final double luong = 100;
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhập tên trưởng phòng: ");
		tenQuanLy = scanner.nextLine();
	}
	@Override
	public void tinhLuong() {
		luongThang = luong * this.getSoNgayLam();
		System.out.println("Lương: " + luongThang);
	}
	

	
	
}
