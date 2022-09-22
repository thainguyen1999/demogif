package BTVN_QLKH;

import BTVN_QLKH.KhachHang;

public class KHNuocNgoai  extends KhachHang {
    //khai bao bien chua thong tin rieng cua kh nc ngoai
    private  String QuocTich;
     // tao constructor
    public  KHNuocNgoai(){

    }

    public KHNuocNgoai(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKh, String quocTich) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHHD, HoTenKh);
        this.QuocTich = quocTich;
    }
    //tao phuong thuc get set

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }
    //tao ham nhap thong tin khach hang
    public void nhap(){
        super.Nhap();
        System.out.println("Nhap quoc tich: ");
        QuocTich=sc.nextLine();
    }
    //tao ham tinh tien
    public double TTien(){
        return this.SoLuong*this.DonGia;
    }
    //tao ham xuat thong tin cua khach hang

    @Override
    public String toString() {
        return "KHNuocNgoai{"+super.toString() +
                "QuocTich='" + QuocTich + '\'' +
                '}';
    }
}
