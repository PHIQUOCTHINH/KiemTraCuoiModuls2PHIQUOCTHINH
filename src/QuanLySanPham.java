import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
    public SanPham taoSanPham(Scanner scanner){
        try {
            System.out.println("Nhap ma san pham");
            String maSanPham = scanner.nextLine();
            System.out.println("Nhap ten san pham");
            String ten = scanner.nextLine();
            System.out.println("Nhap gia san pham");
            double gia = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap so luong san pham");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap vao mo ta");
            String moTa = scanner.nextLine();

            return new SanPham(maSanPham,ten,gia,soLuong,moTa);
        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang, nhap lai");
        }
return null;
    }
    public void themSanPham(){
        SanPham sanPham = taoSanPham(scanner);
        sanPhams.add(sanPham);
    }
//    public void  xoaSanPham(){
//        System.out.println("Nhap vao ma san pham muon xoa");
//        String maSanPham = scanner.nextLine();
//        String chon;
//        for (int i = 0; i < sanPhams.size(); i++) {
//            if (sanPhams.get(i).getMaSanPham().equals(maSanPham)){
//               do {
//                   System.out.println(sanPhams.get(i));
//                   System.out.println("Y de xoa");
//                   System.out.println("Nhap bat ky de quay lai menu");
//                   chon = scanner.nextLine();
//                   switch (chon){
//                       case "Y":
//                           sanPhams.remove(sanPhams.get(i));
//                           break;
//               }
//               }while (!chon.equals("Y"));
//            } else {
//                System.out.println("Khong tim duoc san pham voi ma san pham tren");
//
//            }
//        }
//
//    }
    public void xoaSanPham() {
        try {
            System.out.println("Nh???p m?? s???n ph???m mu???n x??a: ");
            String maSanPham = scanner.nextLine();
            for (int i = 0; i < sanPhams.size(); i++) {
                if (sanPhams.get(i).getMaSanPham().equals(maSanPham)) {
                    sanPhams.remove(i);
                }else {
                    System.out.println("M?? s???n ph???m kh??ng t???n t???i!");
                }
            }
        }catch (Exception e){
            System.out.println("Nhap sai dinh dang, nhap lai");
        }

    }

    public void hienThiSanPham(){
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
        }
    }
    public void capNhap(){
        try {
            System.out.println("Nhap vao ma sna pham muon sua");
            String maSanPham = scanner.nextLine();
            for (int i = 0; i < sanPhams.size(); i++) {
                if (sanPhams.get(i).getMaSanPham().equals(maSanPham)){
                    System.out.println("Nhap ma san pham moi");
                    String maMoi = scanner.nextLine();
                    System.out.println("Nhap ten moi");
                    String ten = scanner.nextLine();
                    System.out.println("Nhap gia moi");
                    double gia = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhap vao so luong moi");
                    int soLuong = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap vao mo ta moi");
                    String moTa = scanner.nextLine();
                    sanPhams.get(i).setMaSanPham(maMoi);
                    sanPhams.get(i).setTen(ten);
                    sanPhams.get(i).setGia(gia);
                    sanPhams.get(i).setSoLuong(soLuong);
                    sanPhams.get(i).setMoTa(moTa);
                } else {
                    System.out.println("Khong tim duoc san pham voi ma san pham tren");
                }
        }

        } catch (Exception e) {
            System.out.println("Nhap dung dinh dang, nhap lai di");
        }
    }
    public void sanPhamDatNhat(){
        double giaDatNhat = sanPhams.get(0).getGia();
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getGia() > giaDatNhat){
                giaDatNhat = sanPhams.get(i).getGia();
                System.out.println(sanPhams.get(i));
            }
        }
    }
    public void ghiTapTin(String tenTapTin){
        try {
            File file = new File("products.csv");
            if (!file.exists()){
                file.createNewFile();
        }
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (SanPham sanPham : sanPhams) {
                bufferedWriter.write(sanPham.getMaSanPham() + "," + sanPham.getTen() + "," + sanPham.getGia() + "," + sanPham.getSoLuong() + "," + sanPham.getMoTa() + "\n");
            }
            bufferedWriter.close();
    } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
  public void docTapTin(){
        ArrayList<SanPham> sanPhams1 = new ArrayList<>();
        try {
            File file = new File("products.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String giaTri;
            while ((giaTri = bufferedReader.readLine()) != null){
                String[] strings = giaTri.split(",");
                SanPham sanPham = new SanPham(strings[0],strings[1],Double.parseDouble(strings[2]),Integer.parseInt(strings[3]),strings[4] );
                sanPhams.add(sanPham);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
  }
    Comparator<SanPham> compareUp = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham o1, SanPham o2) {
            return (int) (o1.getGia() - o2.getGia());
        }
    } ;

    Comparator<SanPham> compareDown = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham o1, SanPham o2) {
            return (int) (o2.getGia() - o1.getGia());
        }
    } ;


    // S???p x???p t??ng d???n
    public void displayUp(){
        System.out.println("S???n ph???m ???????c s???p x???p t??ng d???n ...");
        sanPhams.sort(compareUp);
        hienThiSanPham();
    }

    public void displayDown(){
        System.out.println("S???n ph???m ???????c s???p x???p gi???m d???n ...");
       sanPhams.sort(compareDown);
       hienThiSanPham();
    }

}