/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String idkhachhang;
    private String tenKhachHang;
    private String diaChi;
    private String gioiTinh;
    private String cMND;
    private String phoneNumber;
    private String email;
    private String quocTich;
    private String imgKhachHang;

    public KhachHang(String idkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich, String imgKhachHang) {
        this.idkhachhang = idkhachhang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
        this.imgKhachHang = imgKhachHang;
    }
    
    

    public KhachHang(String iDkhachhang, String tenKhachHang) {
        this.idkhachhang = iDkhachhang;
        this.tenKhachHang = tenKhachHang;
    }

    public KhachHang(String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        this.idkhachhang = iDkhachhang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.quocTich = quocTich;
    }

    public String getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(String idkhachhang) {
        this.idkhachhang = idkhachhang;
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

    public String getImgKhachHang() {
        return imgKhachHang;
    }

    public void setImgKhachHang(String imgKhachHang) {
        this.imgKhachHang = imgKhachHang;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "idkhachhang=" + idkhachhang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", cMND=" + cMND + ", phoneNumber=" + phoneNumber + ", email=" + email + ", quocTich=" + quocTich + ", imgKhachHang=" + imgKhachHang + '}';
    }

    

    

   
    
}
