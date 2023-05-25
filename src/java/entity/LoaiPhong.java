/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class LoaiPhong {
    private String iDLoaiPhong;
    private String tenLoaiPhong;
    private String trangBi;

    public LoaiPhong(String iDLoaiPhong, String tenLoaiPhong, String trangBi) {
        this.iDLoaiPhong = iDLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.trangBi = trangBi;
    }

    public String getiDLoaiPhong() {
        return iDLoaiPhong;
    }

    public void setiDLoaiPhong(String iDLoaiPhong) {
        this.iDLoaiPhong = iDLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public String getTrangBi() {
        return trangBi;
    }

    public void setTrangBi(String trangBi) {
        this.trangBi = trangBi;
    }

    @Override
    public String toString() {
        return "{" + "iDLoaiPhong=" + iDLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + ", trangBi=" + trangBi + '}';
    }
    
    
}
