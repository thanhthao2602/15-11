import java.util.*;
public class main1 {
    public static List<phongmay> listphongmay =  new ArrayList<>();
    static{
        listphongmay.add(new phongmay("12","1ab", new quanly("abc","Thao") , new may(11,"HP","tot"),1));
        listphongmay.add(new phongmay("112","11ab", new quanly("adc","Thanh") , new may(11,"Dell","tot"),3));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong phong may : ");
        int sl = s.nextInt();
        for(int i=0 ; i< sl ; i++){
            phongmay phongmay = new phongmay();
            phongmay.nhap();
            listphongmay.add(phongmay);
        }
        System.out.println("Thong tin cac phong may : ");
        for(phongmay phongmay: listphongmay)
            phongmay.xuat();
        // tìm theo mã máy
        System.out.println("Nhap ma may muon tim");
        int ma = s.nextInt();
        System.out.println("Thong tin ma may can tim la : ");
        for(phongmay phongmay: listphongmay){
            if(phongmay.getY().getMaMay() == ma){
                phongmay.xuat();
            }
        }
        s.close();
    }
}
