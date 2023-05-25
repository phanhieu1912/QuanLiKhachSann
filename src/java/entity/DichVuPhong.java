/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class DichVuPhong extends DichVu{
     private String iDDichVuPhong;
      private String iDPhong;

    public DichVuPhong() {
    }

    public DichVuPhong(String iDDichVuPhong, String iDPhong) {
        this.iDDichVuPhong = iDDichVuPhong;
        this.iDPhong = iDPhong;
    }

    public DichVuPhong(String iDDichVuPhong, String iDPhong, String iDDichVu, String tenDichVu, String giaDichVu) {
        super(iDDichVu, tenDichVu, giaDichVu);
        this.iDDichVuPhong = iDDichVuPhong;
        this.iDPhong = iDPhong;
    }

    public String getiDDichVuPhong() {
        return iDDichVuPhong;
    }

    public void setiDDichVuPhong(String iDDichVuPhong) {
        this.iDDichVuPhong = iDDichVuPhong;
    }

    public String getiDPhong() {
        return iDPhong;
    }

    public void setiDPhong(String iDPhong) {
        this.iDPhong = iDPhong;
    }

    @Override
    public String toString() {
        return "DichVuPhong{" + "iDDichVuPhong=" + iDDichVuPhong + ", iDPhong=" + iDPhong + '}';
    }
    
}
