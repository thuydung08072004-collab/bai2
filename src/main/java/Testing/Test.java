
package Testing;
import java.util.Scanner;
import Class.QlCB;
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QlCB qlcb=new QlCB ();
        qlcb.nhapDanhSach(sc);
        System.out.print("Nhap ho ten can bo can kiem:");
        String name= sc.nextLine();
        qlcb.timkiemCanBo(name);
        
        sc.close();
    }
}
