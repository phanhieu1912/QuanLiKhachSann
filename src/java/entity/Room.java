/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Room {

    private String maPhong;
    private String tenPhong;
    private int tinhTrang;
    private String maLoaiPhong;
    private double giaPhong;

    public Room() {
    }

    public Room(String maPhong, String tenPhong, int tinhTrang, String maLoaiPhong, double giaPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.tinhTrang = tinhTrang;
        this.maLoaiPhong = maLoaiPhong;
        this.giaPhong = giaPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", tinhTrang=" + tinhTrang + ", maLoaiPhong=" + maLoaiPhong + ", giaPhong=" + giaPhong + '}';
    }

    

}
