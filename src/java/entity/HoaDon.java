/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class HoaDon extends ThuePhong{
    private int iDHoaDon;
    private float tongTien;
    private float tienTraTruoc;
    private String maHoaDonDatCoc;
    private String maHoaDonTotal;
    private String dateDatCoc;
    private String dateTotal;

    public HoaDon(int iDHoaDon, float tongTien, float tienTraTruoc, String maHoaDonDatCoc, String maHoaDonTotal ,String dateDatCoc, String dateTotal ,int iDThuePhong, String iDKhachHang, String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        super(iDThuePhong, iDKhachHang, iDkhachhang, tenKhachHang, diaChi, gioiTinh, cMND, phoneNumber, email, quocTich);
        this.iDHoaDon = iDHoaDon;
        this.tongTien = tongTien;
        this.tienTraTruoc = tienTraTruoc;
        this.maHoaDonDatCoc = maHoaDonDatCoc;
        this.maHoaDonTotal = maHoaDonTotal;
        this.dateDatCoc = dateDatCoc;
        this.dateTotal = dateTotal;
    }

    public String getMaHoaDonDatCoc() {
        return maHoaDonDatCoc;
    }

    public void setMaHoaDonDatCoc(String maHoaDonDatCoc) {
        this.maHoaDonDatCoc = maHoaDonDatCoc;
    }

    public String getMaHoaDonTotal() {
        return maHoaDonTotal;
    }

    public void setMaHoaDonTotal(String maHoaDonTotal) {
        this.maHoaDonTotal = maHoaDonTotal;
    }

    public String getDateDatCoc() {
        return dateDatCoc;
    }

    public void setDateDatCoc(String dateDatCoc) {
        this.dateDatCoc = dateDatCoc;
    }

    public String getDateTotal() {
        return dateTotal;
    }

    public void setDateTotal(String dateTotal) {
        this.dateTotal = dateTotal;
    }
    
    

    public int getiDHoaDon() {
        return iDHoaDon;
    }

    public void setiDHoaDon(int iDHoaDon) {
        this.iDHoaDon = iDHoaDon;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTienTraTruoc() {
        return tienTraTruoc;
    }

    public void setTienTraTruoc(float tienTraTruoc) {
        this.tienTraTruoc = tienTraTruoc;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "iDHoaDon=" + iDHoaDon + ", tongTien=" + tongTien + ", tienTraTruoc=" + tienTraTruoc + ", maHoaDonDatCoc=" + maHoaDonDatCoc + ", maHoaDonTotal=" + maHoaDonTotal + ", dateDatCoc=" + dateDatCoc + ", dateTotal=" + dateTotal + '}';
    }

   
    
    
    
}
