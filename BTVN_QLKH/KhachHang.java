package BTVN_QLKH;

import java.util.Scanner;

public class KhachHang {
    // khai baos bien chua thong tin co ban cua khach
    protected int MaKH, SoLuong;
    protected double DonGia, Thanhtien;
    protected String NgayHHD, HoTenKH;

     Scanner sc= new Scanner(System.in);
     //tao constructor khong tham so va day du tham so
    public KhachHang(){

    }
    public KhachHang(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKh){
        this.MaKH= MaKH;
        this.SoLuong=SoLuong;
        this.DonGia=DonGia;
        this.Thanhtien=ThanhTien;
        this.NgayHHD=NgayHHD;
        this.HoTenKH=HoTenKh;
    }
    // tao cac phuong thuc get set

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        Thanhtien = thanhtien;
    }

    public String getNgayHHD() {
        return NgayHHD;
    }

    public void setNgayHHD(String ngayHHD) {
        NgayHHD = ngayHHD;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
    //tao ham nhap thong tin cua khach hang
    public void Nhap(){
        System.out.println("nhap ma khach hang: ");
        MaKH= sc.nextInt();
        System.out.println("nhap ho va ten khach hang: ");
        HoTenKH=sc.nextLine();
        System.out.println("nhap ngay lap hoa don:");
        NgayHHD=sc.nextLine();
        System.out.println("So luong (Kw)");
        SoLuong=sc.nextInt();
        System.out.println("Don Gia: ");
        DonGia=sc.nextDouble();
    }
    //tao ham hien thi thong tin cua khach hang

    @Override
    public String toString() {
        return
                "MaKH=" + MaKH +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", Thanhtien=" + Thanhtien +
                ", NgayHHD='" + NgayHHD + '\'' +
                ", HoTenKH='" + HoTenKH + '\'' ;
    }
}
