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
    public String tenPhong;
    public String tinhTrang;
    public String idLoaiPhong; 
    public String idDichVuPhong;
    public double giaPhong;
    public String imgPhong;

    public Phong( String iDPhong, String iDPhucVu, String tenPhong, String tinhTrang, String idLoaiPhong, String idDichVuPhong, double GiaPhong, String imgPhong, String iDLoaiPhong, String tenLoaiPhong, String trangBi) {
        super(iDLoaiPhong, tenLoaiPhong, trangBi);
        this.iDPhong = iDPhong;
        this.iDPhucVu = iDPhucVu;
        this.tenPhong = tenPhong;
        this.tinhTrang = tinhTrang;
        this.idLoaiPhong = idLoaiPhong;
        this.idDichVuPhong = idDichVuPhong;
        this.giaPhong = GiaPhong;
        this.imgPhong = imgPhong;
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

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
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

    public String getIdDichVuPhong() {
        return idDichVuPhong;
    }

    public void setIdDichVuPhong(String idDichVuPhong) {
        this.idDichVuPhong = idDichVuPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double GiaPhong) {
        this.giaPhong = GiaPhong;
    }

    public String getImgPhong() {
        return imgPhong;
    }

    public void setImgPhong(String imgPhong) {
        this.imgPhong = imgPhong;
    }

    @Override
    public String toString() {
        return "Phong{" +super.toString()+ "iDPhong=" + iDPhong + ", iDPhucVu=" + iDPhucVu + ", tenPhong=" + tenPhong + ", tinhTrang=" + tinhTrang + ", idLoaiPhong=" + idLoaiPhong + ", idDichVuPhong=" + idDichVuPhong + ", GiaPhong=" + giaPhong + ", imgPhong=" + imgPhong + '}';
    }
    
    
    

}
