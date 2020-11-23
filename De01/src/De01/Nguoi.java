package De01;

import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String gioiTinh;
	private LocalDate ngayThangNS;
	
	public Nguoi() {}
	
	public Nguoi(String hoTen, String gioiTinh, 
			LocalDate ngayThangNS) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngayThangNS = ngayThangNS;
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		hoTen = input.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioiTinh = input.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		ngayThangNS = LocalDate.parse(input.nextLine());
	}
	
	public void output() {
		System.out.println("Ho Va Ten: " + hoTen);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Ngay Thang Nam Sinh: " + ngayThangNS);
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LocalDate getNgayThangNS() {
		return ngayThangNS;
	}
	public void setNgayThangNS(LocalDate ngayThangNS) {
		this.ngayThangNS = ngayThangNS;
	}
	
	
	
}
