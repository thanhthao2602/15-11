import java.util.Scanner;
public class phongmay {
    private String maPhong;
    private String tenPhong;
    private quanly x ;
    private may y;
    private int n;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public quanly getX() {
        return x;
    }

    public void setX(quanly x) {
        this.x = x;
    }

    public may getY() {
        return y;
    }

    public void setY(may y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public phongmay(String maPhong, String tenPhong, quanly x, may y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public phongmay() {
    }
      public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong = s.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = s.nextLine();

        System.out.println("Nhập thông tin quản lý");
        quanly quanly = new quanly();
        quanly.nhap();
        this.x = quanly;

        System.out.println("Nhập thông tin máy: ");
        may may = new may();
        may.nhap();
        this.y = may;

        System.out.println("Nhập n: ");
        this.n = Integer.parseInt(s.nextLine());
    }
     @Override
    public String toString() {
        return "PhongMay{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", quanLy=" + x +
                ", may=" + y +
                ", n=" + n +
                '}';
    }
      public  void  xuat(){
        System.out.println(toString());
    }
}
