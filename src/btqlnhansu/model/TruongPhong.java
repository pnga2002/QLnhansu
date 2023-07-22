package btqlnhansu.model;

import java.util.Scanner;

public class TruongPhong extends Person {
	private final Scanner scanner = new Scanner(System.in);
	
	private int soThanhVien;
	private final String chucVu = "trưởng phòng";
	private final double luong = 200;

	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhập số nhân viên: ");
		soThanhVien = scanner.nextInt();
	}
	
	@Override
	public void tinhLuong() {
		luongThang = getSoNgayLam() * luong + 100 * soThanhVien;
	}

}
