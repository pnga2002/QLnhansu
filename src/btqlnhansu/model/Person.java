package btqlnhansu.model;

import java.util.Scanner;

public class Person {
	private String maSo;
	private String hoTen;
	private String sdt;
	private int soNgayLam;
	protected double luong;
	protected double luongThang;
	private String chucVu;

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public void tinhLuong() {
		luongThang=0;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số: ");
		this.maSo = sc.nextLine();
		System.out.println("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập số điện thoại: ");
		this.sdt = sc.nextLine();
		System.out.println("Nhập số ngày làm việc: ");
		this.soNgayLam = sc.nextInt();
		sc.nextLine();
	}
	public void xuat() {
		System.out.println("Mã số: " + getMaSo());
		System.out.println("Họ tên: " + getHoTen());
		System.out.println("SDT: " + getSdt());
		System.out.println("Số ngày làm: " + getSoNgayLam());
		System.out.println("Chuc vu: " + getChucVu());
		System.out.println("Lương: " + getLuong());
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public Person() {

	}

	public Person(String maSo, String hoTen, String sdt, int soNgayLam, double luong) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLam = soNgayLam;
		this.luong = luong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuongThang() {
		return luongThang;
	}

	public void setLuongThang(double luongThang) {
		this.luongThang = getLuong() * getSoNgayLam();
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
}
