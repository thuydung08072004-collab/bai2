package Class;
import java.util.Scanner;
import java.util.ArrayList;
public class QlCB {
    private ArrayList <CanBo> dscb;
    public QlCB(){
        dscb = new ArrayList<CanBo>(10);
    }
    public void themCanBo(CanBo cb){
        dscb.add(cb);
    }
    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.print("Nhap vao so luong can bo:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap thong tin chi tiet:");
    for (int i=0;i<n;i++){
    System.out.println("Lan nhap thu "+(i+1)+":");
    System.out.println("Chon can bo(1-KySu; 2-NhanVien; 3-CongNhan):");
    int chon=sc.nextInt();
    sc.nextLine();
    cb=new CanBo();
        switch (chon) {
            case 1:
                cb=new KySu();
                break;
            case 2:
                cb=new NhanVien();
                break;
             case 3:
                cb=new CongNhan();
                break;
            default:
                cb=new KySu();
                break;       
        }
        cb.nhapThongTin(sc);
        themCanBo(cb);
}
}
    public void timkiemCanBo(String hoTen){
        for (CanBo cb : dscb){
            if (hoTen.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
        }
    }
}
