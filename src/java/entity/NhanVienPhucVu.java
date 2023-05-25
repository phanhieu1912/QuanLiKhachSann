/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class NhanVienPhucVu {
     private String iDPhucVu;
      private String tenPhucVu;
       private String imgNVPV;
        private String gioiTinh;
         private String ngaySinh;
          private String email;
           private String diaChi;
            private String soDienthoai;
             private String iDPhong;
              private String quocTich;

    public NhanVienPhucVu() {
    }

    public NhanVienPhucVu(String iDPhucVu, String tenPhucVu, String imgNVPV, String gioiTinh, String ngaySinh, String email, String diaChi, String soDienthoai, String iDPhong, String quocTich) {
        this.iDPhucVu = iDPhucVu;
        this.tenPhucVu = tenPhucVu;
        this.imgNVPV = imgNVPV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.diaChi = diaChi;
        this.soDienthoai = soDienthoai;
        this.iDPhong = iDPhong;
        this.quocTich = quocTich;
    }

    public String getiDPhucVu() {
        return iDPhucVu;
    }

    public void setiDPhucVu(String iDPhucVu) {
        this.iDPhucVu = iDPhucVu;
    }

    public String getTenPhucVu() {
        return tenPhucVu;
    }

    public void setTenPhucVu(String tenPhucVu) {
        this.tenPhucVu = tenPhucVu;
    }

    public String getImgNVPV() {
        return imgNVPV;
    }

    public void setImgNVPV(String imgNVPV) {
        this.imgNVPV = imgNVPV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(String soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    public String getiDPhong() {
        return iDPhong;
    }

    public void setiDPhong(String iDPhong) {
        this.iDPhong = iDPhong;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "NhanVienPhucVu{" + "iDPhucVu=" + iDPhucVu + ", tenPhucVu=" + tenPhucVu + ", imgNVPV=" + imgNVPV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", email=" + email + ", diaChi=" + diaChi + ", soDienthoai=" + soDienthoai + ", iDPhong=" + iDPhong + ", quocTich=" + quocTich + '}';
    }
              
             
}
