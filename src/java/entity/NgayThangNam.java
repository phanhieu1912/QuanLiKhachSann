/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NgayThangNam {
    private Date ngayNhanPhong;
    private Date ngayTraPhong;

    public NgayThangNam(Date ngayNhanPhong, Date ngayTraPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }
    
    public void formatDate(){
        Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
                String strDate = dateFormat.format(date);  
                System.out.println("Converted String: " + strDate);  
    }

    @Override
    public String toString() {
        return "NgayThangNam{" + "ngayNhanPhong=" + ngayNhanPhong.toString() + ", ngayTraPhong=" + ngayTraPhong.toString() + '}';
    }

    
    
}
