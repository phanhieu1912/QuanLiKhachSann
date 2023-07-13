/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class DichVuPhongDaDuocThue {
    private String iDDichVuPhong;
     private String iDPhong;
     private String iDDichVu;
     private int soLuongDichVu; 
     private String tenDichVu;
     private float giaDichVu;
     private String desDichVu;
     private String imgDichVu;
     private int iDChiTietThuePhong;

    public DichVuPhongDaDuocThue(String iDDichVuPhong, String iDPhong, String iDDichVu, int soLuongDichVu, String tenDichVu, float giaDichVu, String desDichVu, String imgDichVu, int iDChiTietThuePhong) {
        this.iDDichVuPhong = iDDichVuPhong;
        this.iDPhong = iDPhong;
        this.iDDichVu = iDDichVu;
        this.soLuongDichVu = soLuongDichVu;
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
        this.desDichVu = desDichVu;
        this.imgDichVu = imgDichVu;
        this.iDChiTietThuePhong = iDChiTietThuePhong;
    }

    public String getiDDichVuPhong() {
        return iDDichVuPhong;
    }

    public void setiDDichVuPhong(String iDDichVuPhong) {
        this.iDDichVuPhong = iDDichVuPhong;
    }

    public String getiDPhong() {
        return iDPhong;
    }

    public void setiDPhong(String iDPhong) {
        this.iDPhong = iDPhong;
    }

    public String getiDDichVu() {
        return iDDichVu;
    }

    public void setiDDichVu(String iDDichVu) {
        this.iDDichVu = iDDichVu;
    }

    public int getSoLuongDichVu() {
        return soLuongDichVu;
    }

    public void setSoLuongDichVu(int soLuongDichVu) {
        this.soLuongDichVu = soLuongDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(float giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    public String getDesDichVu() {
        return desDichVu;
    }

    public void setDesDichVu(String desDichVu) {
        this.desDichVu = desDichVu;
    }

    public String getImgDichVu() {
        return imgDichVu;
    }

    public void setImgDichVu(String imgDichVu) {
        this.imgDichVu = imgDichVu;
    }

    public int getiDChiTietThuePhong() {
        return iDChiTietThuePhong;
    }

    public void setiDChiTietThuePhong(int iDChiTietThuePhong) {
        this.iDChiTietThuePhong = iDChiTietThuePhong;
    }

    @Override
    public String toString() {
        return "DichVuPhongDaDuocThue{" + "iDDichVuPhong=" + iDDichVuPhong + ", iDPhong=" + iDPhong + ", iDDichVu=" + iDDichVu + ", soLuongDichVu=" + soLuongDichVu + ", tenDichVu=" + tenDichVu + ", giaDichVu=" + giaDichVu + ", desDichVu=" + desDichVu + ", imgDichVu=" + imgDichVu + ", iDChiTietThuePhong=" + iDChiTietThuePhong + '}';
    }
     
     
}
