package btqlnhansu.model;

import java.util.Scanner;

public class GiamDoc extends Person{
private final Scanner scanner = new Scanner(System.in);
	
	public double coPhan;
	private final String chucVu = "Giám đốc";
    private final double luong = 300;
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhập tên trưởng phòng: ");
		coPhan = scanner.nextDouble();
		while (coPhan > 1) {
			System.out.print("Số nhập vào phải nhỏ hơn 100%. Mời bạn nhập lại: ");
			coPhan = scanner.nextDouble();
		}
	}
	@Override
	public void tinhLuong() {
		luongThang = luong * this.getSoNgayLam();
		System.out.println("Lương: " + luongThang);
	}
	
}
