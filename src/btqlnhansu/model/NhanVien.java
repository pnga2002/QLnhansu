package btqlnhansu.model;

import java.util.Scanner;

public class NhanVien extends Person{
	private final Scanner scanner = new Scanner(System.in);
	
	public NhanVien(String maSo, String hoTen, String sdt, int soNgayLam, double luong, String tenQuanLy) {
		super();
		this.tenQuanLy = tenQuanLy;
	}
	public NhanVien() {
	}
	public String getTenQuanLy() {
		return tenQuanLy;
	}
	public void setTenQuanLy(String tenQuanLy) {
		this.tenQuanLy = tenQuanLy;
	}
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
	public void xuat() {
		super.xuat();
		System.out.println("Tên quản lý: " + tenQuanLy);
	}
	@Override
	public void setLuong(double luong) {
		// TODO Auto-generated method stub
		super.setLuong(luong);
	}

	
	

	
	
}
