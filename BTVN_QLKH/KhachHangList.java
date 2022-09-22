package BTVN_QLKH;

public class KhachHangList {
    //tao mang kh
    private KhachHang kh[]=new KhachHang[100];
    private  int countKH, sum1=0, sum2=0,dem=0,sumtien=0;
    //tao ham tao moi kh trong tung vi tri cua mang
    public KhachHangList(){
        countKH=0;
        for (int i = 0; i <100 ; i++) {
            kh[i]=new KhachHang();
        }
    }
    //tao ham chon them khach hang
    public void themKh(int temp){
        if (countKH>100){
            System.out.println("bo nho day!");
        }else {
            if (temp==1){
                kh[countKH]=new KHViet();
                KHViet khv= new KHViet();
                khv.nhap();
                khv.Thanhtien=khv.TTien();
                kh[countKH]=khv;
                sum1 +=khv.SoLuong;
            }else {
                kh[countKH]=new KHNuocNgoai();
                KHNuocNgoai khnn=new KHNuocNgoai();
                khnn.nhap();
                khnn.Thanhtien=khnn.TTien();
                sum2+=khnn.SoLuong;
                sumtien += khnn.Thanhtien;
            }
            dem++;
            countKH++;
        }
    }
    //tao ham hien thi thong tin khach hang
    public void HienThi(){
        for (int i = 0; i <countKH ; i++) {
            System.out.println("so tt"+(i+1));
            System.out.println(kh[i].toString());
        }
    }
}
