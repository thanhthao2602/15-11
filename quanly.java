import java.util.Scanner;
public class quanly {
    private String maQL;
    private String tenQL;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public quanly(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public quanly() {
    }
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma quan ly :");
        maQL = s.next();
        System.out.println("Nhap ten quan ly :");
        tenQL = s.nextLine();
    }
    @Override
    public String toString(){
        return "QuanLy{" +
                "maQL= '" +maQL +'\'' +", tenQL='" +tenQL+'\''+
                '}';
    }
    public void xuat(){
        System.out.println(toString());
    }
}
