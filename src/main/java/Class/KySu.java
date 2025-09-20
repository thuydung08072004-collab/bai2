
package Class;

import java.util.Scanner;
public class KySu extends CanBo {
    private String nganhDaoTao;
    public KySu(){
        
    }
    public KySu(String hoten, String ngaysinh, String gioitinh, String diachi){
   super(hoten, ngaysinh, gioitinh, diachi);
   this.nganhDaoTao=nganhDaoTao;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao=sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("\tNganh dao tao: "+ nganhDaoTao);
    }
    }

