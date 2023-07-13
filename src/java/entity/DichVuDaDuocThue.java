/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class DichVuDaDuocThue extends DichVuPhong{
    private String iDKhach;

    public DichVuDaDuocThue(String iDKhach, String iDDichVuPhong, String iDPhong, String iDDichVu, int soLuongDichVu, String tenDichVu, float giaDichVu, String desDichVu, String imgDichVu, int iDChiTietThuePhong, int iDThuePhong, String iDKhachHang, String iDkhachhang, String tenKhachHang, String diaChi, String gioiTinh, String cMND, String phoneNumber, String email, String quocTich) {
        super(iDDichVuPhong, iDPhong, iDDichVu, soLuongDichVu, tenDichVu, giaDichVu, desDichVu, imgDichVu, iDChiTietThuePhong, iDThuePhong, iDKhachHang, iDkhachhang, tenKhachHang, diaChi, gioiTinh, cMND, phoneNumber, email, quocTich);
        this.iDKhach = iDKhach;
    }

    public String getiDKhach() {
        return iDKhach;
    }

    public void setiDKhach(String iDKhach) {
        this.iDKhach = iDKhach;
    }

    @Override
    public String toString() {
        return "DichVuDaDuocThue{" + "iDKhach=" + iDKhach + '}';
    }

    
}
