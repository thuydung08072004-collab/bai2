package Class;
import java.util.Scanner;
public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    public CanBo(){
        
    }
    public CanBo(String hoten, String ngaysinh, String gioitinh, String diachi){
        this.hoTen=hoten;
        this.ngaySinh=ngaysinh;
        this.gioiTinh=gioitinh;
        this.diaChi=diachi;
    }
    public void nhapThongTin (Scanner sc){
        System.out.print("\tNhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh=sc.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        gioiTinh=sc.nextLine();
        System.out.print("\tNhap dia chi ");
        diaChi=sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("\tHo ten:"+hoTen);
        System.out.println("\tNgay Sinh:"+ngaySinh);
        System.out.println("\tGioi Tinh:"+gioiTinh);
        System.out.println("\tDia Chi:"+diaChi);
    }
    public String getHoTen(){
        return this.hoTen;
    }
}
