/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class NgayDaDatPhong {
    private String iDPhong;
    private String ngayNhanPhong;
    private String ngayTraPhong;

    public NgayDaDatPhong(String iDPhong, String ngayNhanPhong, String ngayTraPhong) {
        this.iDPhong = iDPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
    }

    public String getiDPhong() {
        return iDPhong;
    }

    public void setiDPhong(String iDPhong) {
        this.iDPhong = iDPhong;
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

    @Override
    public String toString() {
        return "NgayDaDatPhong{" + "iDPhong=" + iDPhong + ", ngayNhanPhong=" + ngayNhanPhong + ", ngayTraPhong=" + ngayTraPhong + '}';
    }
    
}
