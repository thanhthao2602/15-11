import java.util.*;

public class main {
    public static List<Sach> listSach = new ArrayList<>();
    static{
        listSach.add(new Sach(123,"Toi thay hoa vang tren co xanh",2010,"Tiểu thuyết",new tacgia("Nguyen Nhat Anh",1955)));
        listSach.add(new Sach(120,"Cay chuoi non mang giay xanh",2012,"Tiểu thuyết",new tacgia("Nguyen Nhat Anh",1955)));
        listSach.add(new Sach(121,"Think and grow rich",2010,"Tiểu thuyết",new tacgia("Napoleon Hill",1883)));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so quyen sach");
       int n = s.nextInt();
       for(int i=0 ;i<n ;i++){
           Sach sach = new Sach();
           sach.input();
           listSach.add(sach);
       }
       for(Sach sach : listSach)
           sach.output();
       
        //tìm kiếm 
        System.out.println("Nhap sach muon tim : ");
       
            String ten =s.nextLine();
            System.out.println("Thong tin sach can tim : ");
              for(Sach sach: listSach){
                  if(sach.getTenSach().contains(ten)){
                      sach.output();
              }
         
         }
        // SX theo tên tác giả
        System.out.println("Sau khi sx : ");
        sortBytenTacGia();
        for(Sach sach:listSach){
            sach.output();
        }
           
        
      s.close(); 
    }
    public static void sortBytenTacGia(){
            Collections.sort(listSach, new Comparator<Sach>(){
                @Override
                public int compare(Sach o1 , Sach o2){
                     return o1.getX().getTenTacGia().compareTo(o2.getX().getTenTacGia());
                           
                }
            });
        }
    
}
