import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        int chon;
        do {
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhap");
            System.out.println("4. Xoa");
            System.out.println("5. Sap xep");
            System.out.println("6. Tim san pham co gia dat nhat");
            System.out.println("7. Doc tu file");
            System.out.println("8. Ghi vao file");
            System.out.println("9. Thoat");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    quanLySanPham.hienThiSanPham();
                    break;
                case 2:
                    quanLySanPham.themSanPham();
                    break;
                case 3:
                    quanLySanPham.capNhap();
                    break;
                case 4:
                   quanLySanPham.xoaSanPham();

                case 5:
                    int chon1;
                    do {
                        System.out.println("-----Menu-----");
                        System.out.println("1. Gia tang dan");
                        System.out.println("2. gia giam dan");
                        System.out.println("3. Quay lại menu");
                        System.out.println("====>Chon di");
                        chon1 = Integer.parseInt(scanner.nextLine());
                        switch (chon1){
                            case 1:
                                quanLySanPham.displayUp();
                                break;
                            case 2:
                                quanLySanPham.displayDown();
                                break;
                        }
                    }while (chon1!=3);
                    break;
                case 6:
                    quanLySanPham.sanPhamDatNhat();
                    break;
                case 7:
                    quanLySanPham.docTapTin();
                    break;
                case 8:
                    quanLySanPham.ghiTapTin("products.csv");
                    break;

            }
        }while (chon !=9);
    }
}
