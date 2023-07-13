/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class  Phong  extends LoaiPhong{
    public String iDPhong;
    public String iDPhucVu;
    public String tinhTrang;
    public String idLoaiPhong;
    public float giaPhong;

    public Phong(String iDPhong, String iDPhucVu, String tinhTrang, String idLoaiPhong, float giaPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi, String imgLoaiPhong, int soNguoi) {
        super(iDLoaiPhong, tenLoaiPhong, trangBi, imgLoaiPhong, soNguoi);
        this.iDPhong = iDPhong;
        this.iDPhucVu = iDPhucVu;
        this.tinhTrang = tinhTrang;
        this.idLoaiPhong = idLoaiPhong;
        this.giaPhong = giaPhong;
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
        return "Phong{" + "iDPhong=" + iDPhong + ", iDPhucVu=" + iDPhucVu + ", tinhTrang=" + tinhTrang + ", idLoaiPhong=" + idLoaiPhong + ", giaPhong=" + giaPhong + '}';
    }

    

}
