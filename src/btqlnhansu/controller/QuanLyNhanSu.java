package btqlnhansu.controller;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import btqlnhansu.model.GiamDoc;
import btqlnhansu.model.NhanVien;
import btqlnhansu.model.Person;
import btqlnhansu.model.TruongPhong;

public class QuanLyNhanSu {
	private static Person person;
	private static String mTenCongTy;
	private static String mMaSoThue;
	private static double mDoanhThuThang;
	private static List<Person> mDSNhanSu;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		inforCongTy();
	}

	private static void inforCongTy() {
		System.out.println("WELLCOME TO COMPANY VIP");
		System.out.println("Nhập tên công ty: ");
		mTenCongTy = sc.nextLine();

		System.out.println("Nhập mã số thuế: ");
		mMaSoThue = sc.nextLine();

		System.out.println("Nhập doanh thu tháng: ");
		mDoanhThuThang = sc.nextDouble();

		sc.nextLine();
		mDSNhanSu = new ArrayList<Person>();

		for (int i = 0; i < mDSNhanSu.size(); i++) {
			System.out.println("Thành viên thứ " + (i + 1));
			so4();
		}
		run(menu());
	}

	public static void askExit() {
		System.out.println("  >>>>>>>>>>>> THOAT(Y/N) <<<<<<<<<<<");
		yn: while (true) {
			String answer = sc.nextLine();
			switch (answer) {
			case "n":
				run(menu());
				break yn;
			// dong y tiep tuc chuong trinh
			case "N":
				run(menu());
				break yn;
			case "y": // thoat chuong trinh
			case "Y":
				System.out.println("+======================================+");
				System.out.println("     !!!!!!!!!! KET THUC !!!!!!!!!");
				System.out.println("+======================================+");
				System.exit(0);
			default:
				System.out.println("+======================================+");
				System.out.println("   #########  KHONG HOP LE  ########");
				System.out.println("+======================================+");
				System.out.println("  >>>>>>>>>>>> THOAT(Y/N) <<<<<<<<<<<");
			}
		}
	}

	private static int menu() {
		System.out.println(" ____________________________QUẢN LÝ NHÂN SỰ_________________________");
		System.out.println("| 1.  Thắng chức cho Nhân viên  -> Trưởng phòng                       |");
		System.out.println("| 2.  Thêm nhân sự                                                    |");
		System.out.println("| 3.  xóa nhân sự                                                     |");
		System.out.println("| 4.  xuất thông tin cả công ty                                       |");
		System.out.println("| 5.  Tổng lương toàn công ty                                         |");
		System.out.println("| 6.  Tìm Nhân viên thường có lương cao nhất                          |");
		System.out.println("| 7.  Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất    |");
		System.out.println("| 8.  Sắp xếp nhân viên toàn công ty theo thứ tự abc                  |");
		System.out.println("| 9.  Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần       |");
		System.out.println("| 10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất                     |");
		System.out.println("| 11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc                    |");
		System.out.println("| 0.  THOÁT                                                           |");
		System.out.println("|_____________________________________________________________________|");

		// CHON CHUC NANG
		int choose = 0;
		System.out.println("   >>>>> MOI BAN CHON CHUC NANG <<<<<");
		do {
			try {
				choose = parseInt(sc.nextLine());
			} catch (NumberFormatException e) { // KIEM TRA KIEU GIA TRI NHAP
				// YEU CAU NHAP LAI
				System.out.println("+======================================+");
				System.out.println("   #########  KHONG HOP LE  ########");
				System.out.println("+======================================+");
				System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
				choose = 0;
				continue;
			}
			if (choose >= 0 && choose <= 10) // KIEM TRA CO CHON TRONG 10 CHUC NANG
				break;
			System.out.println("+======================================+");
			System.out.println("  ######  KHONG CO CHUC NANG " + choose + " ######");
			System.out.println("+======================================+");
			System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
		} while (true);

		return choose;
	}

	public static void run(int chosen) {
		switch (chosen) {
		case 1: // CHUC NANG 1
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 1           |");
			System.out.println("+======================================+");
			so1();
			so4();
			askExit();
			break;
		case 2: // CHUC NANG 2
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 2           |");
			System.out.println("+======================================+");
			nhap();
			askExit();
			break;
		case 3: // CHUC NANG 3
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 3           |");
			System.out.println("+======================================+");
			askExit();
			break;
		case 4: // CHUC NANG 4
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 4           |");
			System.out.println("+======================================+");
			so4();
			askExit();
			break;
		case 5: // CHUC NANG 5
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 5           |");
			System.out.println("+======================================+");
			so5();
			askExit();
			break;
		case 6: // CHUC NANG 6
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 6           |");
			System.out.println("+======================================+");
			so6();
			askExit();
			break;
		case 7: // CHUC NANG 7
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 7           |");
			System.out.println("+======================================+");
			so7();
			askExit();
			break;
		case 8: // CHUC NANG 8
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 8           |");
			System.out.println("+======================================+");
			so8();
			askExit();
		case 9: // CHUC NANG 9
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 9           |");
			System.out.println("+======================================+");
			so9();
			askExit();
			break;
		case 10: // CHUC NANG 10
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 10          |");
			System.out.println("+======================================+");
			so10();
			askExit();
			break;
		case 0: // THOAT CHUONG TRINH
			System.out.println("+======================================+");
			System.out.println("|         KET THUC CHUONG TRINH        |");
			System.out.println("+======================================+");
		}
	}

	// case 1
	public static void so1() {
		// hiển thị danh sách chỉ gồm nhân viên
		// chọn nhân viên
		//
		List dsNhanVien = new ArrayList<NhanVien>();
		for (Person nhanSu : mDSNhanSu) {
			if (nhanSu instanceof NhanVien) {
				dsNhanVien.add((NhanVien) nhanSu);
			}
		}
		int max = dsNhanVien.size();
		if (max > 0) {
			System.out.println("DANH SÁCH NHÂN VIÊN");
			for (int i = 0; i < max; i++) {
				Person nhanVien = (Person) dsNhanVien.get(i);
				System.out.printf("%d. %s (%s)", i + 1, nhanVien.getHoTen(), nhanVien.getMaSo());
			}
			int chon = 0;
			do {
				try {
					chon = parseInt(sc.nextLine());
				} catch (NumberFormatException e) { // KIEM TRA KIEU GIA TRI NHAP
					// YEU CAU NHAP LAI
					System.out.println("+======================================+");
					System.out.println("Không có");
					chon = 0;
					continue;
				}
				if (chon >= 0 && chon <= max) // KIEM TRA CO CHON TRONG 10 CHUC NANG
					break;
				System.out.println("+======================================+");
				System.out.println("  ######  KHONG CO CHUC NANG " + chon + " ######");
				System.out.println("Không có");
			} while (true);
			int index = -1;
			for (int i = 0; i < dsNhanVien.size(); i++) {
				index = i;
				break;
			}
			Person nv = mDSNhanSu.get(index);
			Person truongPhong = new TruongPhong();
			truongPhong.setChucVu("Trưởng phòng");
			truongPhong.setMaSo(nv.getMaSo());
			truongPhong.setSdt(nv.getSdt());
			truongPhong.setSoNgayLam(nv.getSoNgayLam());
			truongPhong.setLuong(nv.getLuong());
			mDSNhanSu.set(index, truongPhong);
		}
	}

	// case 2
	public static void nhap() {
		System.out.println("1. Nhân viên");
		System.out.println("2. Trưởng phòng");
		System.out.println("3. Giám đốc");
		System.out.println("Chọn 1 trong 3 phương án trên");

		int chon = 0;
		do {
			try {
				chon = parseInt(sc.nextLine());
			} catch (NumberFormatException e) { // KIEM TRA KIEU GIA TRI NHAP
				// YEU CAU NHAP LAI
				System.out.println("+======================================+");
				System.out.println("   #########  KHONG HOP LE  ########");
				System.out.println("+======================================+");
				System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
				chon = 0;
				continue;
			}
			if (chon > 0 && chon <= 3) // KIEM TRA CO CHON TRONG 10 CHUC NANG
				break;
			System.out.println("+======================================+");
			System.out.println("  ######  KHONG CO CHUC NANG " + chon + " ######");
			System.out.println("+======================================+");
			System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
		} while (true);

		switch (chon) {
		case 1:
			person = new NhanVien();
			person.setChucVu("Nhân viên");
			person.setLuong(100);
			person.nhap();

			mDSNhanSu.add(person);
			break;
		case 2:
			person = new TruongPhong();
			person.setChucVu("Trưởng phòng");
			person.setLuong(200);
			person.nhap();
			mDSNhanSu.add(person);
			break;
		case 3:
			person = new GiamDoc();
			person.setChucVu("Giám đốc");
			person.setLuong(300);
			person.nhap();
			mDSNhanSu.add(person);
			break;

		default:
			break;
		}
	}

	// case3
	public static void so3() {
		System.out.println("DANH SÁCH NHÂN VIÊN");
		for (int i = 0; i < mDSNhanSu.size(); i++) {
			Person nhanVien = (Person) mDSNhanSu.get(i);
			System.out.printf("%d. %s (%s)", i + 1, nhanVien.getHoTen(), nhanVien.getMaSo());

		}
		int chon = 0;
		do {
			try {
				chon = parseInt(sc.nextLine());
			} catch (NumberFormatException e) { // KIEM TRA KIEU GIA TRI NHAP
				// YEU CAU NHAP LAI
				System.out.println("+======================================+");
				System.out.println("Không có");
				chon = 0;
				continue;
			}
			if (chon >= 0 && chon <= mDSNhanSu.size()) // KIEM TRA CO CHON TRONG 10 CHUC NANG
				break;
			System.out.println("+======================================+");
			System.out.println("  ######  KHONG CO CHUC NANG " + chon + " ######");
			System.out.println("Không có");
		} while (true);
		int index = -1;
		for (int i = 0; i < mDSNhanSu.size(); i++) {
			index = i;
			break;
		}
		mDSNhanSu.remove(index);
		// reset
		for (Person nhanSu : mDSNhanSu) {
			if (nhanSu instanceof NhanVien) {
				NhanVien nhanVien = (NhanVien) nhanSu;
				Boolean isSuccess = false;
				for (Person truongPhong : mDSNhanSu) {
					if (truongPhong instanceof TruongPhong && nhanVien.getHoTen().equals(truongPhong.getHoTen())) {
						isSuccess = true;
						break;
					}
				}
				if (!isSuccess) {
					nhanVien.setTenQuanLy("");
				}
			}
		}

	}

	// case 4
	public static void so4() {
		System.out.println("Danh sách nhân sự");
		for (Person x : mDSNhanSu) {
			x.xuat();
		}

	}

	// case5
	public static void so5() {
		double sum = 0d;
		for (Person nhanSu : mDSNhanSu) {
			sum += nhanSu.getLuong() * nhanSu.getSoNgayLam();
		}
		System.out.println("Tổng lưởng của công ty là; " + sum);
	}
//	?case6
	public static void so6() {
		double max =0;
		NhanVien a = new NhanVien();
		for(Person nv:mDSNhanSu) {
			if(nv instanceof NhanVien && (nv.getLuong() * nv.getSoNgayLam())>max) {
				max=nv.getLuong() * nv.getSoNgayLam();
				a = (NhanVien) nv;
			}
		}
		System.out.println(a.getHoTen());
	}
//	?case7
	public static void so7() {
		double max =0;
		TruongPhong a = new TruongPhong();
		for(Person nv:mDSNhanSu) {
			if(nv instanceof TruongPhong && ((TruongPhong) nv).getSoThanhVien()>max) {
				max=nv.getLuong() * nv.getSoNgayLam();
				a = (TruongPhong) nv;
			}
		}
		System.out.println(a.getHoTen());
	}
//	?case8
	public static void so8() {
		sort(mDSNhanSu, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });so4();
	}

//	?case9
	public static void so9() {
		sort(mDSNhanSu, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getMaSo().compareTo(o2.getMaSo());
            }
        });so4();
	}
//	?case10
	public static void so10() {
		System.out.println("Tổng giám đốc VIP nhất: ");
	}

}
