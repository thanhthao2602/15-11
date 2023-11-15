import java.util.Scanner;
public class tacgia {
  private  String tenTacGia;
  private int namSinh;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public tacgia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public tacgia() {
    }
    public void  input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        tenTacGia = s.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = s.nextInt();
    }
   @Override
        public String toString () {
            return "TacGia{" +
                    "tenTacGia='" + tenTacGia + '\'' +
                    ", namSinh=" + namSinh +
                    '}';
        }
        public void output(){
            System.out.println(toString());
        }
}
