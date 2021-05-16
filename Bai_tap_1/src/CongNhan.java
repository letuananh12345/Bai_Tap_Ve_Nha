import java.sql.Array;
import java.util.Arrays;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
