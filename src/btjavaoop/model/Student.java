package btjavaoop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private String maSV;
	private String tenSV;
	private boolean gioiTinh;
	private Date ngSinh;
	private double dtoan;
	private double dly;
	private double dhoa;
	
	
	
	
	
	public Student() {
		super();
	}
	public Student(String maSV, String tenSV, boolean gioiTinh, Date ngSinh, double dtoan, double dly, double dhoa) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.gioiTinh = gioiTinh;
		this.ngSinh = ngSinh;
		this.dtoan = dtoan;
		this.dly = dly;
		this.dhoa = dhoa;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nhap MaSV: ");
		this.maSV = sc.nextLine();
		System.out.println("Nhap TenSV: ");
		this.tenSV = sc.nextLine();
		System.out.println("Nhap gioiTinh: ");
		this.gioiTinh = sc.nextBoolean();
		System.out.print("Date (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        Date birth_of_date = null;
        try{
            birth_of_date = sdf.parse(dateStr);
        }
        catch (Exception ex) {
            System.out.println("Invalid date format!");
        }
        this.ngSinh=birth_of_date;
         
		System.out.println("Nhap diem toan: ");
		this.dtoan = sc.nextDouble();
		System.out.println("Nhap diem ly: ");
		this.dly = sc.nextDouble();
		System.out.println("Nhap diem hoa: ");
		this.dhoa = sc.nextDouble();
		sc.close();
	}
	public void xuat() {
		System.out.println("Ma sinh vien: " + this.maSV);
		System.out.println("Ten sinh vien: " + this.maSV);
		System.out.println("Gioi tinh: " + this.gioiTinh);
		System.out.println("Ngay sinh: " + this.ngSinh);
		System.out.println("Diem toan: " + this.dtoan);
		System.out.println("Diem ly: " + this.dly);
		System.out.println("Diem hoa: " + this.dhoa);
		System.out.println("Diem trung binh: " + this.dtb());
		System.out.println("Xep Loai: " + this.xepLoai());
	}
	public double dtb() {
		double kq = (this.dtoan+this.dly+this.dhoa)/3;
		return kq;
	}
	public String xepLoai() {
		double dtb = this.dtb();
		String kq  ="";
		if(dtb>=9) {
			kq="Xuat Xac";
		} else if(dtb>=8) {
			kq="Gioi";
		} else if(dtb>=6) {
			kq="Kha";
		} else if(dtb>=5) {
			kq="TB";
		} else if(dtb>=3) {
			kq="Yeu";
		}
		return kq;
	}
	
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgSinh() {
		return ngSinh;
	}
	public void setNgSinh(Date ngSinh) {
		this.ngSinh = ngSinh;
	}
	public double getDtoan() {
		return dtoan;
	}
	public void setDtoan(double dtoan) {
		this.dtoan = dtoan;
	}
	public double getDly() {
		return dly;
	}
	public void setDly(double dly) {
		this.dly = dly;
	}
	public double getDhoa() {
		return dhoa;
	}
	public void setDhoa(double dhoa) {
		this.dhoa = dhoa;
	}
	
	
}
