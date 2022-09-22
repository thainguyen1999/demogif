package BTVN_QLKH;

import BTVN_QLKH.KhachHang;

// tao lop kh viet ke thua tu lop khachhang
public class KHViet  extends KhachHang {
    private  int LoaiKH, DinhMuc;
    //tao constructor khong tham so va day du tham so
    public KHViet(){

    }

    public KHViet(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKh, int loaiKH, int dinhMuc) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHHD, HoTenKh);
        this.LoaiKH = loaiKH;
        this.DinhMuc = dinhMuc;
    }
    //tao cac phuong thuc get set

    public int getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(int loaiKH) {
        LoaiKH = loaiKH;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        DinhMuc = dinhMuc;
    }
    // tao ham nhap thong tin cua kh viet
    public void nhap(){
        super.Nhap();
        System.out.println("NHAP loai khach hang (1.Sinh hoat  2.Kinh doanh   3.San xuat):");
        LoaiKH=sc.nextInt();
        System.out.println("Dinh Muc:");
        DinhMuc=sc.nextInt();
    }
    //tao ham tinh tien
    public double TTien(){
        if(SoLuong <= DinhMuc){
            return this.DonGia*this.SoLuong;
        }
        else {
            return this.DinhMuc*this.DonGia+(this.SoLuong-this.DinhMuc)*this.DonGia;
        }
    }
    //tao ham xuat thong tin khach hang

    @Override
    public String toString() {
        String temp;
        if(LoaiKH==1){
            temp="sinh hoat";
        }else if (LoaiKH==2){
            temp="Kinh doanh";
        }else {
            temp="san xuat";
        }
        return "KHViet{" +
                "LoaiKH=" +super.toString()+ temp +
                ", DinhMuc=" + DinhMuc +
                '}';
    }
}