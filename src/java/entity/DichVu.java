/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class DichVu {

    private String iDDichVu;
    private String tenDichVu;
    private String giaDichVu;
    private String desDichVu;
    private String imgDichVu;

    public DichVu(String iDDichVu, String tenDichVu, String giaDichVu, String desDichVu, String imgDichVu) {
        this.iDDichVu = iDDichVu;
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
        this.desDichVu = desDichVu;
        this.imgDichVu = imgDichVu;
    }

    public String getiDDichVu() {
        return iDDichVu;
    }

    public void setiDDichVu(String iDDichVu) {
        this.iDDichVu = iDDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(String giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    public String getDesDichVu() {
        return desDichVu;
    }

    public void setDesDichVu(String desDichVu) {
        this.desDichVu = desDichVu;
    }

    public String getImgDichVu() {
        return imgDichVu;
    }

    public void setImgDichVu(String imgDichVu) {
        this.imgDichVu = imgDichVu;
    }

    @Override
    public String toString() {
        return "DichVu{" + "iDDichVu=" + iDDichVu + ", tenDichVu=" + tenDichVu + ", giaDichVu=" + giaDichVu + ", desDichVu=" + desDichVu + ", imgDichVu=" + imgDichVu + '}';
    }

}
