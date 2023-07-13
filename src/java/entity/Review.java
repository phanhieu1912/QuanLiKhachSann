/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Review {
    private int iDReview;
    private int starRate;
    private String noiDung;
    private String thoiGianReview;
    private String iDKhachHang;
    private String tenKhachHang;
    private int iDChiTietThuePhong;
    private String imgKhachHang;

    public Review(int iDReview, int starRate, String noiDung, String thoiGianReview, String iDKhachHang, String tenKhachHang, int iDChiTietThuePhong, String imgKhachHang) {
        this.iDReview = iDReview;
        this.starRate = starRate;
        this.noiDung = noiDung;
        this.thoiGianReview = thoiGianReview;
        this.iDKhachHang = iDKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.iDChiTietThuePhong = iDChiTietThuePhong;
        this.imgKhachHang = imgKhachHang;
    }

    

    public int getiDReview() {
        return iDReview;
    }

    public void setiDReview(int iDReview) {
        this.iDReview = iDReview;
    }

    public int getStarRate() {
        return starRate;
    }

    public void setStarRate(int starRate) {
        this.starRate = starRate;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getThoiGianReview() {
        return thoiGianReview;
    }

    public void setThoiGianReview(String thoiGianReview) {
        this.thoiGianReview = thoiGianReview;
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

    public int getiDChiTietThuePhong() {
        return iDChiTietThuePhong;
    }

    public void setiDChiTietThuePhong(int iDChiTietThuePhong) {
        this.iDChiTietThuePhong = iDChiTietThuePhong;
    }

    public String getImgKhachHang() {
        return imgKhachHang;
    }

    public void setImgKhachHang(String imgKhachHang) {
        this.imgKhachHang = imgKhachHang;
    }

    @Override
    public String toString() {
        return "Review{" + "iDReview=" + iDReview + ", starRate=" + starRate + ", noiDung=" + noiDung + ", thoiGianReview=" + thoiGianReview + ", iDKhachHang=" + iDKhachHang + ", tenKhachHang=" + tenKhachHang + ", iDChiTietThuePhong=" + iDChiTietThuePhong + ", imgKhachHang=" + imgKhachHang + '}';
    }

    
    
    
}
