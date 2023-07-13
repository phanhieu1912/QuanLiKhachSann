/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class ChiTietThuePhong extends Phong{
    
    private int ngaySuDung;
    private int iDChiTietThuePhong;
    private int iDThuePhong;
    private float giaPhongg;
    private String ngayNhanPhong;
    private String ngayTraPhong;
    private int soLuongNguoiLon;
    private int soLuongTreEm;
    private int soLuongPhong;
    private String iDKhachHang;
    private String tenKhachHang;
    private String diaChi;
    private String gioiTinh;
    private String cMND;
    private String phoneNumber;
    private String email;
    private String quocTich;
    private int idNgayDaDatPhong;
    private int tinhTrangChiTietThuePhong;
    private String imgKhachHang;
    
    

    public ChiTietThuePhong(int iDChiTietThuePhong, int iDThuePhong, String ngayNhanPhong, String ngayTraPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, String imgKhachHang, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.imgKhachHang = imgKhachHang;
    }

    public String getImgKhachHang() {
        return imgKhachHang;
    }

    public void setImgKhachHang(String imgKhachHang) {
        this.imgKhachHang = imgKhachHang;
    }

   
    

    public ChiTietThuePhong(int ngaySuDung, int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, int idNgayDaDatPhong, int tinhTrangChiTietThuePhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.ngaySuDung = ngaySuDung;
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.idNgayDaDatPhong = idNgayDaDatPhong;
        this.tinhTrangChiTietThuePhong = tinhTrangChiTietThuePhong;
    }
    
    
    

    public ChiTietThuePhong(int ngaySuDung, int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, int tinhTrangChiTietThuePhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.ngaySuDung = ngaySuDung;
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.tinhTrangChiTietThuePhong = tinhTrangChiTietThuePhong;
    }
    
    

    public ChiTietThuePhong(int ngaySuDung, int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, int idNgayDaDatPhong, int tinhTrangChiTietThuePhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.ngaySuDung = ngaySuDung;
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.idNgayDaDatPhong = idNgayDaDatPhong;
        this.tinhTrangChiTietThuePhong = tinhTrangChiTietThuePhong;
    }
    
    
    

    public ChiTietThuePhong( int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, int idNgayDaDatPhong, int tinhTrangChiTietThuePhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.idNgayDaDatPhong = idNgayDaDatPhong;
        this.tinhTrangChiTietThuePhong = tinhTrangChiTietThuePhong;
    }
    
    
   


    
    

    public ChiTietThuePhong(int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, int idNgayDaDatPhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.idNgayDaDatPhong = idNgayDaDatPhong;
    }
    
    

    public ChiTietThuePhong(int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDKhachHang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
    }
    

    public ChiTietThuePhong(int iDChiTietThuePhong, int iDThuePhong, float giaPhongg, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong, String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDPhong, iDPhucVu, tinhTrang, idLoaiPhong, giaPhong, iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.iDThuePhong = iDThuePhong;
        this.giaPhongg = giaPhongg;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.soLuongNguoiLon = soLuongNguoiLon;
        this.soLuongTreEm = soLuongTreEm;
        this.soLuongPhong = soLuongPhong;
    }

    public int getTinhTrangChiTietThuePhong() {
        return tinhTrangChiTietThuePhong;
    }

    public void setTinhTrangChiTietThuePhong(int tinhTrangChiTietThuePhong) {
        this.tinhTrangChiTietThuePhong = tinhTrangChiTietThuePhong;
    }
    
    
    

    public int getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(int ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
    }

    public int getIdNgayDaDatPhong() {
        return idNgayDaDatPhong;
    }

    public void setIdNgayDaDatPhong(int idNgayDaDatPhong) {
        this.idNgayDaDatPhong = idNgayDaDatPhong;
    }
    
    

    public String getiDKhachHang() {
        return iDKhachHang;
    }

    public void setiDKhachHang(String iDKhachHang) {
        this.iDKhachHang = iDKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    

    public int getiDChiTietThuePhong() {
        return iDChiTietThuePhong;
    }

    public void setiDChiTietThuePhong(int iDChiTietThuePhong) {
        this.iDChiTietThuePhong = iDChiTietThuePhong;
    }

    public int getiDThuePhong() {
        return iDThuePhong;
    }

    public void setiDThuePhong(int iDThuePhong) {
        this.iDThuePhong = iDThuePhong;
    }

    public float getGiaPhongg() {
        return giaPhongg;
    }

    public void setGiaPhongg(float giaPhongg) {
        this.giaPhongg = giaPhongg;
    }

    public String getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(String ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public String getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(String ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public int getSoLuongNguoiLon() {
        return soLuongNguoiLon;
    }

    public void setSoLuongNguoiLon(int soLuongNguoiLon) {
        this.soLuongNguoiLon = soLuongNguoiLon;
    }

    public int getSoLuongTreEm() {
        return soLuongTreEm;
    }

    public void setSoLuongTreEm(int soLuongTreEm) {
        this.soLuongTreEm = soLuongTreEm;
    }

    public int getSoLuongPhong() {
        return soLuongPhong;
    }

    public void setSoLuongPhong(int soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
    }

    public String getiDPhong() {
        return iDPhong;
    }

    public void setiDPhong(String iDPhong) {
        this.iDPhong = iDPhong;
    }

    public String getiDPhucVu() {
        return iDPhucVu;
    }

    public void setiDPhucVu(String iDPhucVu) {
        this.iDPhucVu = iDPhucVu;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getIdLoaiPhong() {
        return idLoaiPhong;
    }

    public void setIdLoaiPhong(String idLoaiPhong) {
        this.idLoaiPhong = idLoaiPhong;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "ChiTietThuePhong{" + "ngaySuDung=" + ngaySuDung + ", iDChiTietThuePhong=" + iDChiTietThuePhong + ", iDThuePhong=" + iDThuePhong + ", giaPhongg=" + giaPhongg + ", ngayNhanPhong=" + ngayNhanPhong + ", ngayTraPhong=" + ngayTraPhong + ", soLuongNguoiLon=" + soLuongNguoiLon + ", soLuongTreEm=" + soLuongTreEm + ", soLuongPhong=" + soLuongPhong + ", iDKhachHang=" + iDKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", cMND=" + cMND + ", phoneNumber=" + phoneNumber + ", email=" + email + ", quocTich=" + quocTich + ", idNgayDaDatPhong=" + idNgayDaDatPhong + ", tinhTrangChiTietThuePhong=" + tinhTrangChiTietThuePhong + '}';
    }

    

    

    

    
    
    
}
