import java.io.Serializable;

public class SanPham implements Serializable{
    private String maSanPham;
    private String ten;
    private double gia;
    private int soLuong;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSanPham, String ten, double gia, int soLuong, String moTa) {
        this.maSanPham = maSanPham;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
