import java.util.ArrayList;

public class Coffee {
    protected String ten;
    protected double gia ;
    protected String loai;

    public Coffee(String ten, double gia,String loai ) {
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;

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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public String toString() {
        return "Ten ca phe: "+ getTen() + " - Gia: "+ getGia();
    }
}
