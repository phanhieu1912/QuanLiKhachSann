/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class ThuePhong extends KhachHang{
    private int iDThuePhong;
    private String iDKhachHang;
    private int trangThai;
    private String maHoaDon;
    private int iDHoaDon;
    
    
    
    public ThuePhong(int iDThuePhong, String iDKhachHang, int trangThai,String maHoaDon,int iDHoaDon, String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        super(iDkhachhang, tenKhachHang, diaChi, gioiTinh, cMND, phoneNumber, email, quocTich);
        this.iDThuePhong = iDThuePhong;
        this.iDKhachHang = iDKhachHang;
        this.trangThai = trangThai;
        this.maHoaDon = maHoaDon;
        this.iDHoaDon = iDHoaDon;
    }
    
    public ThuePhong(int iDThuePhong, String iDKhachHang, int trangThai, String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        super(iDkhachhang, tenKhachHang, diaChi, gioiTinh, cMND, phoneNumber, email, quocTich);
        this.iDThuePhong = iDThuePhong;
        this.iDKhachHang = iDKhachHang;
        this.trangThai = trangThai;
    }
    

    public ThuePhong(int iDThuePhong, String iDKhachHang, String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        super(iDkhachhang, tenKhachHang, diaChi, gioiTinh, cMND, phoneNumber, email, quocTich);
        this.iDThuePhong = iDThuePhong;
        this.iDKhachHang = iDKhachHang;
    }

    public int getiDHoaDon() {
        return iDHoaDon;
    }

    public void setiDHoaDon(int iDHoaDon) {
        this.iDHoaDon = iDHoaDon;
    }
    

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    
    

    public int getiDThuePhong() {
        return iDThuePhong;
    }

    public void setiDThuePhong(int iDThuePhong) {
        this.iDThuePhong = iDThuePhong;
    }

    public String getiDKhachHang() {
        return iDKhachHang;
    }

    public void setiDKhachHang(String iDKhachHang) {
        this.iDKhachHang = iDKhachHang;
    }

    @Override
    public String toString() {
        return "ThuePhong{" + "iDThuePhong=" + iDThuePhong + ", iDKhachHang=" + iDKhachHang + '}';
    }

    
    
}
