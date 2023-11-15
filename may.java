import java.util.Scanner;
public class may {
  private int maMay;
  private String kieuMay;
private String tinhTrang;  

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public may(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public may() {
    }
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma may : ");
        maMay = s.nextInt();
        System.out.println("Nhap kieu may : ");
        kieuMay = s.nextLine();
        System.out.println("Nhap tinh trang may : ");
        tinhTrang = s.nextLine();
        
    }
    @Override
    public String toString(){
        return "May{"+"maMay ='"+maMay +'\'' + ", kieuMay='"+kieuMay+'\''+", tinhTrang='"+tinhTrang +'\''+
                '}';
    }
    public void xuat(){
        System.out.println(toString());
    }

}
