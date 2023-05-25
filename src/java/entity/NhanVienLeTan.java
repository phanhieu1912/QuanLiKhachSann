/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class NhanVienLeTan {
    private String iDLeTan;
      private String tenLeTan;
        private String gioiTinh;
         private String imgngaySinh;
         private String ngaySinh;
          private String email;
           private String diaChi;
            private String soDienthoai;
              private String quocTich;

    public NhanVienLeTan() {
    }

    public NhanVienLeTan(String iDLeTan, String tenLeTan, String gioiTinh, String imgngaySinh, String ngaySinh, String email, String diaChi, String soDienthoai, String quocTich) {
        this.iDLeTan = iDLeTan;
        this.tenLeTan = tenLeTan;
        this.gioiTinh = gioiTinh;
        this.imgngaySinh = imgngaySinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.diaChi = diaChi;
        this.soDienthoai = soDienthoai;
        this.quocTich = quocTich;
    }

    public String getiDLeTan() {
        return iDLeTan;
    }

    public void setiDLeTan(String iDLeTan) {
        this.iDLeTan = iDLeTan;
    }

    public String getTenLeTan() {
        return tenLeTan;
    }

    public void setTenLeTan(String tenLeTan) {
        this.tenLeTan = tenLeTan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getImgngaySinh() {
        return imgngaySinh;
    }

    public void setImgngaySinh(String imgngaySinh) {
        this.imgngaySinh = imgngaySinh;
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

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "NhanVienLeTan{" + "iDLeTan=" + iDLeTan + ", tenLeTan=" + tenLeTan + ", gioiTinh=" + gioiTinh + ", imgngaySinh=" + imgngaySinh + ", ngaySinh=" + ngaySinh + ", email=" + email + ", diaChi=" + diaChi + ", soDienthoai=" + soDienthoai + ", quocTich=" + quocTich + '}';
    }
              
}
