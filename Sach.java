 import java.util.Scanner;
public class Sach {
     private static  int count = 0;
    private int id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private tacgia x;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public tacgia getX() {
        return x;
    }

    public void setX(tacgia x) {
        this.x = x;
    }

    public Sach( int id, String tenSach, int namXuatBan, String theLoai, tacgia x) {
        this.id = id;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.x = x;
    }

    public Sach() {
        count++;
        this.id = count;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten sach : ");
        tenSach = s.nextLine();
        System.out.println("Nhap nam xuat ban ");
         namXuatBan = s.nextInt();
         System.out.println("Nhap the loai sach : ");
         theLoai = s.nextLine();
         System.out.println("Nhap thong tin tac gia : ");
         tacgia tg = new tacgia();
         tg.input();
    }
      @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", tenSach='" + tenSach + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", theLoai='" + theLoai + '\'' +
                ", tacGia=" + x +
                '}';
    }
      public void output(){
        System.out.println(toString());
    }
    
}
