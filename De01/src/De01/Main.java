package De01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void showInFo() {
		System.out.println("1.Nhap vao danh sach n sinh vien"
				+ " va thong tin sinh vien!");
		System.out.println("2.Hien thi thong tin sinh vien!");
		System.out.println("3.Dua ra bang diem cua 1 lop bat ki theo"
				+ " ten lop duoc nhap tu ban phim!");
		System.out.println("4.Sap xep danh sach sinh vien giam dan theo diem trung binh!");
		System.out.println("5.Dua ra danh sach sinh vien co hoc bong!");
		System.out.println("6.Ket Thuc!!!");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<SinhVien> aray = new ArrayList<>();
		int chon;
		do {
			showInFo();
			System.out.println("Moi ban chon: ");
			chon = Integer.parseInt(input.nextLine());
				switch (chon) {
				case 1:
					int tongSV;
					System.out.println("Nhap tong so sinh vien: ");
					tongSV = Integer.parseInt(input.nextLine());
					for (int i = 0; i < tongSV; i++) {
						LoiNhapDiem lnd = new LoiNhapDiem();
						aray.add(lnd);
						System.out.println("Nhap Thong tin sinh vien " + (i+1) + " :");
						aray.get(i).input();
						lnd.loiNhapDiem();
					}
					break;
				case 2:
					for (int i = 0; i < aray.size(); i++) {
						System.out.println("Thong tin sinh vien " + (i+1) + " :");
						aray.get(i).output();
					}		
					break;
				case 3:
					String tenLop;
					System.out.println("Ten lop can dua ra bang diem: ");
					tenLop = input.nextLine();
					int check = 0;
					for (int i = 0; i < aray.size(); i++) {
						if (aray.get(i).getLop().equalsIgnoreCase(tenLop)) {
							System.out.print("Ho Ten: " + aray.get(i).getHoTen()+"           ");
							aray.get(i);
							System.out.print("Diem" + SinhVien.getDiemTB() + "\n");
							check++;
						}
					}
					if (check == 0) {
						System.err.println("Khong co lop can tim!!!!");
					}
					break;
				case 4:
					
					//int cmp = o1.getName().compareTo(o2.getName());
					//if(cmp >= 0) {
						//return 1;
					//}else {
					//	return -1;
					//}
					Collections.sort(aray, new Comparator<SinhVien>() {
						@Override
						public int compare(SinhVien o1, SinhVien o2) {
							// TODO Auto-generated method stub
							return SinhVien.getDiemTB() >= SinhVien.getDiemTB()?-1:1;							
							
						}
					});
						for (int i = 0; i < aray.size(); i++) {
								aray.get(i).output();
								}
					break;
				case 5:
					System.out.println("Thong tin sinh vien co hoc bong: ");
					for (int i = 0; i < aray.size(); i++) {
						aray.get(i);
						if (SinhVien.getDiemTB() > 7) {
							aray.get(i).output();
						}
					}
					break;
				case 6:
					System.out.println("Tam Biet!");
					break;

				default:
					System.err.println("Ban Chon Sai Roi!!!!");
					break;
				}
		} while (chon != 7);
	}
}
