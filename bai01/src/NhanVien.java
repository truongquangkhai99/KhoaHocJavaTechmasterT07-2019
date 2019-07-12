public class NhanVien {
    private String tenNhanVien;
    private Double luongCoban;
    private double hesoluong;
    public static double LUONG_MAX = 10000;
    public Boolean tangluong(double increase) {
        double hesoluongMoi = hesoluong + increase;
        double luongmoi = luongCoban * hesoluongMoi;
        if(luongmoi < LUONG_MAX) {
            hesoluong = hesoluongMoi;
            return true;
        } else {
            System.out.println("Ko the tang luong");
            return false;
        }
    }
    public double tinhluong() {
        return luongCoban * hesoluong;
    }
    public void inTTin() {
        System.out.println("ten nhan vien:"+tenNhanVien+
                "\nLuong co ban:"+luongCoban+
                "\nHe so luong:"+hesoluong+
                "\nLuong MAX:"+LUONG_MAX
        );
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoban() {
        return luongCoban;
    }

    public void setLuongCoban(double luongCoban) {
        this.luongCoban = luongCoban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }
}
