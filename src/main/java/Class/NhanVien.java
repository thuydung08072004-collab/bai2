package Class;
import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;
    public NhanVien(){
        
    }
    public NhanVien(String hoten, String ngaysinh, String gioitinh, String diachi){
    super(hoten, ngaysinh,gioitinh, diachi);
            this.congViec = congViec;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap cong viec:");
        congViec=sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("/tCong viec:"+ congViec);
    }
    }

