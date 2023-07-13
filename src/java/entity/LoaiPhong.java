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
    private String imgLoaiPhong;
    private int soNguoi;

    public LoaiPhong(String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        this.iDLoaiPhong = iDLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.trangBi = trangBi;
        this.imgLoaiPhong = imgLoaiPhong;
        this.soNguoi = soNguoi;
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

    public String getImgLoaiPhong() {
        return imgLoaiPhong;
    }

    public void setImgLoaiPhong(String imgLoaiPhong) {
        this.imgLoaiPhong = imgLoaiPhong;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "LoaiPhong{" + "iDLoaiPhong=" + iDLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + ", trangBi=" + trangBi + ", imgLoaiPhong=" + imgLoaiPhong + ", soNguoi=" + soNguoi + '}';
    }
    

    
    
}
