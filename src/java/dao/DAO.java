/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.dbcontext;
import entity.Account;
import entity.ChiTietThuePhong;
import entity.NgayThangNam;
import entity.DichVu;
import entity.DichVuDaDuocThue;
import entity.DichVuPhong;
import entity.DichVuPhongDaDuocThue;
import entity.HoaDon;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.NgayDaDatPhong;
import entity.NhanVienLeTan;
import entity.NhanVienPhucVu;
import entity.Phong;
import entity.Review;
import entity.ThuePhong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class DAO {

    private Connection con;
    String query;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public DAO() {
    }

    public DAO(Connection con) {
        this.con = con;
    }

    public List<Phong> getAllRoom() {
        List<Phong> list = new ArrayList<>();
        String query = "select * from\n"
                + "dbo.Phong , dbo.LoaiPhong\n"
                + "where Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong  ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phong(rs.getString("IDPhong"), rs.getString("IDPhucVu"), rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"), rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Review> getAllReview() {
        List<Review> list = new ArrayList<>();
        String query = "select * from  KhachHangg , ThuePhong , ChiTietThuePhong , Review\n"
                + "where KhachHangg.IDKhachHang = ThuePhong.IDKhach and ThuePhong.IDThuePhong = ChiTietThuePhong.IDThuePhong and ChiTietThuePhong.IDChiTietThuePhong = Review.IDChiTietThuePhong ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Review(rs.getInt("IDReview"), rs.getInt("StarRate"), rs.getString("NoiDung"), rs.getString("TimeReview"),
                        rs.getString("IDKhachHang"), rs.getString("TenKhachHang"), rs.getInt("IDChiTietThuePhong"), rs.getString("ImgKhachHang")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Phong> getAllRoomByID(String pid) {
        List<Phong> list = new ArrayList<>();
        String query = "select * from dbo.Phong , dbo.LoaiPhong\n"
                + "where Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and Phong.IDPhong = ? ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phong(rs.getString("IDPhong"), rs.getString("IDPhucVu"), rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"), rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<LoaiPhong> getAllLoaiPhong() {
        List<LoaiPhong> list = new ArrayList<>();
        String query = "select * from LoaiPhong";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new LoaiPhong(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<NgayDaDatPhong> getAllNgayDaDatPhong() {
        List<NgayDaDatPhong> list = new ArrayList<>();
        String query = "select *from NgayDaDatPhong ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NgayDaDatPhong(rs.getString("IDPhong"), rs.getString("NgayNhanPhong"), rs.getString("NgayTraPhong")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ChiTietThuePhong> getAllChiTietThuePhong() {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, dbo.Phong, dbo.LoaiPhong , dbo.ThuePhong\n"
                + "where ChiTietThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ThuePhong.IDThuePhong = ChiTietThuePhong.IDThuePhong";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"), rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDPhong"), rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"), rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ChiTietThuePhong> getAllChiTietThuePhongDaDuocThue() {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong, NgayDaDatPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang and NgayDaDatPhong.IDPhong = Phong.IDPhong and NgayDaDatPhong.NgayNhanPhong = ChiTietThuePhong.NgayNhanPhong and NgayDaDatPhong.NgayTraPhong = ChiTietThuePhong.NgayTraPhong";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"), rs.getString("NgayTraPhong"),
                        rs.getInt("SoluongNguoiLon"), rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhachHang"), rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"), rs.getString("GioiTinh"), rs.getString("CMND"),
                        rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich"), rs.getInt("IDNgayDatPhong"), rs.getInt("TinhTrangChiTietThuePhong"),
                        rs.getString("IDPhong"), rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"), rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ThuePhong> getAllThuePhongDaDuocThue() {
        List<ThuePhong> list = new ArrayList<>();
        String query = "select * from  ThuePhong , HoaDon , KhachHangg\n"
                + "where HoaDon.IDThuePhong = ThuePhong.IDThuePhong and ThuePhong.IDKhach = KhachHangg.IDKhachHang and ThuePhong.TrangThai = 0";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ThuePhong(rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getInt("TrangThai"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getInt("IDHoaDon"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"), rs.getString("CMND"), rs.getString("SDT"), rs.getString("email"), rs.getString("QuocTich")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
     public List<ThuePhong> getAllThuePhongDaDuocThuett1() {
        List<ThuePhong> list = new ArrayList<>();
        String query = "select * from  ThuePhong , HoaDon , KhachHangg\n"
                + "where HoaDon.IDThuePhong = ThuePhong.IDThuePhong and ThuePhong.IDKhach = KhachHangg.IDKhachHang and ThuePhong.TrangThai = 1";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ThuePhong(rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getInt("TrangThai"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getInt("IDHoaDon"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"), rs.getString("CMND"), rs.getString("SDT"), rs.getString("email"), rs.getString("QuocTich")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ChiTietThuePhong> getAllChiTietThuePhongDaDuocThueByID(String pid) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong, NgayDaDatPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang and NgayDaDatPhong.IDPhong = Phong.IDPhong and ThuePhong.IDKhach = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"), rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"), rs.getString("NgayTraPhong"),
                        rs.getInt("SoluongNguoiLon"), rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhachHang"), rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"), rs.getString("GioiTinh"), rs.getString("CMND"),
                        rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich"), rs.getInt("IDNgayDatPhong"),
                        rs.getString("IDPhong"), rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"), rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ChiTietThuePhong> getChiTietThuePhongByID(String pid) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, dbo.Phong, dbo.LoaiPhong , dbo.ThuePhong\n"
                + "where ChiTietThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ThuePhong.IDThuePhong = ChiTietThuePhong.IDThuePhong and ChiTietThuePhong.IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"), rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDPhong"), rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"), rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ChiTietThuePhong> getInformationThuePhongByID(int id) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * , DATEDIFF(day, ChiTietThuePhong.NgayNhanPhong,ChiTietThuePhong.NgayTraPhong) from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong, NgayDaDatPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang and NgayDaDatPhong.IDPhong = Phong.IDPhong and NgayDaDatPhong.NgayNhanPhong = ChiTietThuePhong.NgayNhanPhong \n"
                + "and NgayDaDatPhong.NgayTraPhong = ChiTietThuePhong.NgayTraPhong\n"
                + "and ChiTietThuePhong.IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(
                        rs.getInt(37),
                        rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"),
                        rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"),
                        rs.getString("SDT"),
                        rs.getString("Email"),
                        rs.getString("QuocTich"),
                        rs.getInt("IDNgayDatPhong"),
                        rs.getInt("TinhTrangChiTietThuePhong"),
                        rs.getString("IDPhong"),
                        rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("IDLoaiPhong"),
                        rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"),
                        rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
            System.out.println("abc");
        }
        return list;
    }

    public List<ChiTietThuePhong> vanonkosao(int id) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang\n"
                + "and ChiTietThuePhong.IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"), rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"), rs.getString("DiaChi"), rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"),
                        rs.getString("Email"), rs.getString("QuocTich"), rs.getString("ImgKhachHang"),
                        rs.getString("IDPhong"),
                        rs.getString("IDPhucVu"), rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"), rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"),
                        rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"),
                        rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
            System.out.println("abc");
        }
        return list;
    }

    public List<ChiTietThuePhong> getInformationThuePhongByIDKhach(String id) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * , DATEDIFF(day, ChiTietThuePhong.NgayNhanPhong,ChiTietThuePhong.NgayTraPhong) from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang \n"
                + "and ThuePhong.IDKhach = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(
                        rs.getInt(33),
                        rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"),
                        rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"),
                        rs.getString("SDT"),
                        rs.getString("Email"),
                        rs.getString("QuocTich"),
                        rs.getInt("TinhTrangChiTietThuePhong"),
                        rs.getString("IDPhong"),
                        rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("IDLoaiPhong"),
                        rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"),
                        rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
            System.out.println("abc");
        }
        return list;
    }

    public List<ChiTietThuePhong> getInformationThuePhongByIDThuePhong(int id) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * , DATEDIFF(day, ChiTietThuePhong.NgayNhanPhong,ChiTietThuePhong.NgayTraPhong) from ChiTietThuePhong, ThuePhong , KhachHangg , Phong, LoaiPhong, NgayDaDatPhong\n"
                + "where phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong\n"
                + "and ThuePhong.IDKhach = KhachHangg.IDKhachHang and NgayDaDatPhong.IDPhong = Phong.IDPhong and NgayDaDatPhong.NgayNhanPhong = ChiTietThuePhong.NgayNhanPhong and NgayDaDatPhong.NgayTraPhong = ChiTietThuePhong.NgayTraPhong\n"
                + "and ChiTietThuePhong.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(
                        rs.getInt(37),
                        rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"),
                        rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"),
                        rs.getString("SDT"),
                        rs.getString("Email"),
                        rs.getString("QuocTich"),
                        rs.getInt("IDNgayDatPhong"),
                        rs.getInt("TinhTrangChiTietThuePhong"),
                        rs.getString("IDPhong"),
                        rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("IDLoaiPhong"),
                        rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"),
                        rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
            System.out.println("abc");
        }
        return list;
    }

    public List<ChiTietThuePhong> getAllThuePhongMoiNhat(int pid) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * from ChiTietThuePhong, dbo.Phong, dbo.LoaiPhong, ThuePhong\n"
                + "where ChiTietThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and ChiTietThuePhong.IDThuePhong = ThuePhong.IDThuePhong and ChiTietThuePhong.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"), rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDPhong"), rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"), rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<ChiTietThuePhong> billChiTietThuePhongByIDThuePhongKhachHang(int pid) {
        List<ChiTietThuePhong> list = new ArrayList<>();
        String query = "select * , DATEDIFF(day, ChiTietThuePhong.NgayNhanPhong,ChiTietThuePhong.NgayTraPhong) from ThuePhong, ChiTietThuePhong , Phong, KhachHangg , NgayDaDatPhong , LoaiPhong\n"
                + "where ThuePhong.IDThuePhong = ChiTietThuePhong.IDThuePhong and ChiTietThuePhong.IDPhong = Phong.IDPhong and ThuePhong.IDKhach = KhachHangg.IDKhachHang and NgayDaDatPhong.IDPhong = Phong.IDPhong\n"
                + "and NgayDaDatPhong.NgayNhanPhong = ChiTietThuePhong.NgayNhanPhong and NgayDaDatPhong.NgayTraPhong = ChiTietThuePhong.NgayTraPhong and LoaiPhong.IDLoaiPhong = Phong.IDLoaiPhong\n"
                + "and ThuePhong.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietThuePhong(rs.getInt(37),
                        rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("NgayNhanPhong"),
                        rs.getString("NgayTraPhong"),
                        rs.getInt("SoLuongNguoiLon"),
                        rs.getInt("SoLuongTreEm"),
                        rs.getInt("SoLuongPhong"),
                        rs.getString("IDKhach"),
                        rs.getInt("IDNgayDatPhong"),
                        rs.getInt("TinhTrangChiTietThuePhong"),
                        rs.getString("IDPhong"),
                        rs.getString("IDPhucVu"),
                        rs.getString("TinhTrang"),
                        rs.getString("IDLoaiPhong"),
                        rs.getFloat("GiaPhong"),
                        rs.getString("IDLoaiPhong"),
                        rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"),
                        rs.getString("ImgLoaiPhong"),
                        rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<DichVuPhong> billDichVuPhongByIDThuePhongKhachHang(int pid) {
        List<DichVuPhong> list = new ArrayList<>();
        String query = "select * from DichVuPhong , DichVu , ChiTietThuePhong , Phong , KhachHangg , ThuePhong\n"
                + "where DichVu.IDDichVu = DichVuPhong.IDDichVu and ChiTietThuePhong.IDPhong = Phong.IDPhong and ChiTietThuePhong.IDChiTietThuePhong = DichVuPhong.IDChiTietThuePhong and\n"
                + "ThuePhong.IDKhach = KhachHangg.IDKhachHang and ThuePhong.IDThuePhong = DichVuPhong.IDThuePhong\n"
                + "and DichVuPhong.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DichVuPhong(rs.getString("IDDichVuPhong"), rs.getString("IDPhong"),
                        rs.getString("IDDichVu"), rs.getInt("SoLuongDichVu"), rs.getString("TenDichVu"), rs.getFloat("GiaDichVu"),
                        rs.getString("DesDichVu"),
                        rs.getString("ImgDichVu"), rs.getInt("IDChiTietThuePhong"),
                        rs.getInt("IDThuePhong"), rs.getString("IDKhachHang"), rs.getString("IDKhachHang"), rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"), rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<LoaiPhong> getLoaiPhongByID(String pid) {
        List<LoaiPhong> list = new ArrayList<>();
        String query = "select *from LoaiPhong\n"
                + "where IDLoaiPhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new LoaiPhong(rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"),
                        rs.getString("TrangBi"), rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Phong getLoaiPhongID(String id) {
        List<Phong> list = new ArrayList<>();
        String query = "select * from Phong, LoaiPhong\n"
                + "where Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and LoaiPhong.IDLoaiPhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, id);
            rs = ps.executeQuery();

            return new Phong(rs.getString("IDPhong"),
                    rs.getString("IDPhucVu"),
                    rs.getString("TinhTrang"),
                    rs.getString("IDLoaiPhong"),
                    rs.getFloat("GiaPhong"), rs.getString("IDLoaiPhong"), rs.getString("TenLoaiPhong"), rs.getString("TrangBi"),
                    rs.getString("ImgLoaiPhong"), rs.getInt("SoNguoi"));

        } catch (Exception e) {
        }
        return null;
    }

    public List<NhanVienPhucVu> getAllNVPV() {
        List<NhanVienPhucVu> list = new ArrayList<>();
        String query = "select * from NhanVienPhucVu ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVienPhucVu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<NhanVienLeTan> getAllNVLT() {
        List<NhanVienLeTan> list = new ArrayList<>();
        String query = "select * from NhanVienLeTan ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVienLeTan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<KhachHang> getAllKhachHang() {
        List<KhachHang> list = new ArrayList<>();
        String query = "select * from KhachHangg ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<KhachHang> getAllKhachHangAndAccount() {
        List<KhachHang> list = new ArrayList<>();
        String query = "select * from KhachHangg , Account\n"
                + "where KhachHangg.IDKhachHang = Account.uname";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"),
                        rs.getString("umobile"),
                        rs.getString("email"),
                        rs.getString("QuocTich"),
                        rs.getString("imgKhachHang")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<KhachHang> getKhachHangByUser(String user) {
        List<KhachHang> list = new ArrayList<>();
        String query = "select * from KhachHangg\n"
                + "where IDKhachHang = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString("IDKhachHang"), rs.getString("TenKhachHang"), rs.getString("DiaChi"),
                        rs.getString("GioiTinh"), rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<DichVu> getAllDichVu() {
        List<DichVu> list = new ArrayList<>();
        String query = "select * from DichVu ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DichVu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt("ID"), rs.getString("uname"), rs.getString("upass"), rs.getString("uemail"), rs.getString("umobile"),
                        rs.getInt("isStaff"), rs.getInt("isAdmin")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public NhanVienLeTan getAllNVLTID(String id) {
        List<NhanVienLeTan> list = new ArrayList<>();
        String query = "select * from NhanVienLeTan\n"
                + "where IDLeTan = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new NhanVienLeTan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public NhanVienPhucVu getAllNVPVID(String id) {
        List<NhanVienPhucVu> list = new ArrayList<>();
        String query = "select * from NhanVienPhucVu\n"
                + "    where IDPhucVu = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new NhanVienPhucVu(rs.getString("IDPhucVu"), rs.getString("TenPhucVu"),
                        rs.getString("ImgNhanVienPhucVu"), rs.getString("GioiTinh"),
                        rs.getString("NgaySinh"), rs.getString("Email"),
                        rs.getString("DiaChi"), rs.getString("SDT"), rs.getString("IDPhong"),
                        rs.getString("QuocTich"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int getLast() {

        int newId = 0;
        String query = "select top 1 IDThuePhong from ThuePhong\n"
                + " order by IDThuePhong desc";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                newId = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return newId;
    }

    public int getLastHoaDon() {

        int newId = 0;
        String query = "select top 1 IDHoaDon from HoaDon\n"
                + " order by IDHoaDon desc";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                newId = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return newId;
    }

    public int getLastChiTietThuePhong() {
        int newId = 0;
        String query = "select top 1 IDChiTietThuePhong from ChiTietThuePhong\n"
                + "                order by IDChiTietThuePhong desc";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                newId = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return newId;
    }

    public Account getLastAccount() {

        String query = "select top 1 * from Account\n"
                + "               order by ID desc";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt("ID"),
                        rs.getString("uname"),
                        rs.getString("upass"),
                        rs.getString("uemail"),
                        rs.getString("umobile"),
                        rs.getInt("isStaff"), rs.getInt("isAdmin"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public KhachHang getKhachHangByID(String pid) {

        String query = "select * from KhachHangg\n"
                + "where IDKhachHang = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new KhachHang(rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"), rs.getString("DiaChi"),
                        rs.getString("GioiTinh"), rs.getString("CMND"),
                        rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public float getGiaPhong(String pid) {
        float giaPhong = 0;
        String query = "select GiaPhong from Phong\n"
                + "where iDPhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                giaPhong = rs.getFloat(1);
            }
        } catch (Exception e) {
        }
        return giaPhong;
    }

    public float LayTongTien(String pid) {
        float total = 0;
        String query = "select Total from HoaDonnn\n"
                + "where IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return total;
    }

    public Account login(String user, String password) {
        String query = "select * from Account\n"
                + "where [uname] = ?\n"
                + "and upass = ?\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account loginUser(String user, String password) {
        String query = "select * from Account\n"
                + "where [uname] = ?\n"
                + "and upass = ? and isStaff = 0 and isAdmin = 0\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "select *from Account\n"
                + "where [uname] = ?\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public HoaDon checkMaHoaDonExist(String user) {
        String query = "select *from HoaDon , KhachHangg , ThuePhong\n"
                + "where KhachHangg.IDKhachHang = ThuePhong.IDKhach and HoaDon.IDThuePhong = ThuePhong.IDThuePhong and [MaHoaDon] = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new HoaDon(rs.getInt("IDHoaDon"),
                        rs.getFloat("TongTien"), rs.getFloat("TienTraTruoc"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getString("MaHoaDonTotal"),
                        rs.getString("DateDatCoc"),
                        rs.getString("DateTotal"),
                        rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich"));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public HoaDon checkIDHoaDonExist(int iDHoaDon) {
        String query = "select *from HoaDon , KhachHangg , ThuePhong\n"
                + "where KhachHangg.IDKhachHang = ThuePhong.IDKhach and HoaDon.IDThuePhong = ThuePhong.IDThuePhong and [IDHoaDon] = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setInt(1, iDHoaDon);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new HoaDon(rs.getInt("IDHoaDon"),
                        rs.getFloat("TongTien"),
                        rs.getFloat("TienTraTruoc"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getString("MaHoaDonTotal"),
                        rs.getString("DateDatCoc"),
                        rs.getString("DateTotal"),
                        rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich"));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkEmailExist(String email) {
        String query = "select *from Account\n"
                + "where [uemail] = ?\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkPhoneExist(String phone) {
        String query = "select *from Account\n"
                + "where [umobile] = ?\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountOldPassword(String user, String oldPassword) {
        String query = "select *from Account\n"
                + "where [uname] = ? and upass = ?\n";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, user);
            ps.setString(2, oldPassword);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addIDKhachHang(String user) {
        String query = "insert into KhachHangg(IDKhachHang)\n"
                + "values (?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateHoaDon(int tienTraTruoc, int iDThuePhong, String maHoaDonDatCoc, String dateDatCoc, int iDHoaDon) {
        String query = "update HoaDon\n"
                + "set  TongTien =null,\n"
                + "TienTraTruoc = ?,\n"
                + "IDThuePhong = ?,\n"
                + "MaHoaDonDatCoc =?,\n"
                + "MaHoaDonTotal =null,\n"
                + "DateDatCoc =?,\n"
                + "DateTotal =null\n"
                + "where IDHoaDon =?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setInt(1, tienTraTruoc);
            ps.setInt(2, iDThuePhong);
            ps.setString(3, maHoaDonDatCoc);
            ps.setString(4, dateDatCoc);
            ps.setInt(5, iDHoaDon);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertNewHoaDon() {
        String query = "insert into HoaDon\n"
                + "values (null,null,null,null,null,null,null)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addChiTietThuePhong(int IDThuePhong, String IDPhong, float GiaPhong, String ngayNhanPhong, String ngayTraPhong, int soLuongNguoiLon, int soLuongTreEm, int soLuongPhong) {
        String query = "insert ChiTietThuePhong\n"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, IDThuePhong);
            ps.setString(2, IDPhong);
            ps.setFloat(3, GiaPhong);
            ps.setString(4, ngayNhanPhong);
            ps.setString(5, ngayTraPhong);
            ps.setInt(6, soLuongNguoiLon);
            ps.setInt(7, soLuongNguoiLon);
            ps.setInt(8, soLuongPhong);
            ps.setInt(9, 1);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewLoaiPhong(String IDLoaiPhong, String TenLoaiPhong, String TrangBi, String ImgLoaiPhong, String SoNguoi) {
        String query = "insert LoaiPhong\n"
                + "values(?,?,?,?,?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, IDLoaiPhong);
            ps.setString(2, TenLoaiPhong);
            ps.setString(3, TrangBi);
            ps.setString(4, ImgLoaiPhong);
            ps.setString(5, SoNguoi);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewPhong(String IDPhong, String IDPhucVu, int TinhTrang, String IDLoaiPhong, String GiaPhong) {
        String query = "insert Phong\n"
                + "values(?,?,?,?,?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, IDPhong);
            ps.setString(2, IDPhucVu);
            ps.setInt(3, TinhTrang);
            ps.setString(4, IDLoaiPhong);
            ps.setString(5, GiaPhong);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNgayDaDatPhong(String idPhong, String ngayNhanPhong, String ngayTraPhong) {
        String query = "insert NgayDaDatPhong\n"
                + "values (?,?,?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhong);
            ps.setString(2, ngayNhanPhong);
            ps.setString(3, ngayTraPhong);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addReview(int star, String noiDung, int iDChiTietThuePhong, String timeReview, String img) {
        String query = "insert Review\n"
                + "values (?,?,?,?,?)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, star);
            ps.setString(2, noiDung);
            ps.setInt(3, iDChiTietThuePhong);
            ps.setString(4, timeReview);
            ps.setString(5, img);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void singup(String user, String pass, String email, String phonenumber) {
        String query = "insert into Account\n"
                + "values (?,?,?,?,0,0)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, phonenumber);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void singupStaff(String user, String pass, String email, String phonenumber) {
        String query = "insert into Account\n"
                + "values (?,?,?,?,1,0)";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, phonenumber);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<KhachHang> searchByName(String txtSearch) {
        List<KhachHang> list = new ArrayList<>();
        String query = "select *from KhachHangg\n"
                + "where [TenKhachHang] like ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            // truyen cai id vao ?
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString("IDKhachHang"), rs.getString("TenKhachHang"), rs.getString("DiaChi"),
                        rs.getString("GioiTinh"), rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void editPassword(String user, String newPassword) {
        String query = " update Account set upass= ? where uname = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, user);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateHoaDon(float tongTien, String maHoaDonTotal, String dateTotal, String maHoaDonDatCoc) {
        String query = "  update HoaDon set TongTien= ?,\n"
                + " MaHoaDonTotal = ?,\n"
                + " DateTotal = ?\n"
                + " where MaHoaDonDatCoc = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setFloat(1, tongTien);
            ps.setString(2, maHoaDonTotal);
            ps.setString(3, dateTotal);
            ps.setString(4, maHoaDonDatCoc);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updatePhongDaThanhToan(int pid) {
        String query = " update ChiTietThuePhong set TinhTrangChiTietThuePhong = 2 where IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void removeNgayDaDatPhong(int pid) {
        String query = " DELETE NgayDaDatPhong\n"
                + "FROM NgayDaDatPhong\n"
                + "JOIN ChiTietThuePhong  \n"
                + "ON NgayDaDatPhong.NgayNhanPhong = ChiTietThuePhong.NgayNhanPhong and NgayDaDatPhong.NgayTraPhong = ChiTietThuePhong.NgayTraPhong and NgayDaDatPhong.IDPhong = ChiTietThuePhong.IDPhong\n"
                + "join ThuePhong\n"
                + "on ThuePhong.IDThuePhong = ChiTietThuePhong.IDThuePhong\n"
                + "join Phong\n"
                + "on NgayDaDatPhong.IDPhong = Phong.IDPhong\n"
                + "WHERE ThuePhong.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateDateChiTietThuePhong(String ngayTraPhong, String pid) {
        String query = " update ChiTietThuePhong\n"
                + "set NgayTraPhong = ?\n"
                + "where IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngayTraPhong);
            ps.setString(2, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateTrangThaiThuePhong(int pid) {
        String query = " update ThuePhong\n"
                + "set TrangThai = 1\n"
                + "where IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateDateNgayDaDatPhong(String ngayTraPhong, String pid) {
        String query = " update NgayDaDatPhong\n"
                + "set NgayTraPhong = ?\n"
                + "where IDNgayDatPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngayTraPhong);
            ps.setString(2, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateTinhTrangChiTietThuePhong(String pid) {
        String query = " update ChiTietThuePhong\n"
                + "set TinhTrangChiTietThuePhong = '0'\n"
                + "where IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateChangeRoomChiTietThuePhong(String idPhong, float giaPhong, int soLuongNguoiLon, int soLuongTreEm, String pid) {
        String query = " update ChiTietThuePhong\n"
                + "set IDPhong = ?,\n"
                + "GiaPhong = ? ,\n"
                + "SoLuongNguoiLon = ?,\n"
                + "SoLuongTreEm = ? \n"
                + "where IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhong);
            ps.setFloat(2, giaPhong);
            ps.setInt(3, soLuongNguoiLon);
            ps.setInt(4, soLuongTreEm);
            ps.setString(5, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateChangeRoomNgayDaDatPhong(String idPhong, String pid) {
        String query = " update NgayDaDatPhong\n"
                + "set IDPhong = ?\n"
                + "where IDNgayDatPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhong);
            ps.setString(2, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteDichVuPhong(int pid) {
        String query = "delete from DichVuPhong\n"
                + "where IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deleteIDChiTietThuePhong(String pid) {
        String query = "delete from ChiTietThuePhong\n"
                + "where IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deleteLoaiPhongByID(String pid) {
        String query = "delete from LoaiPhong\n"
                + "where IDLoaiPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deletePhongByID(String pid) {
        String query = "delete from Phong\n"
                + "where IDPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deleteNgayDaDatPhong(String pid) {
        String query = "delete from NgayDaDatPhong\n"
                + "where IDNgayDatPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

//
    public void deleteNVLT(String pid) {
        String query = "delete from NhanVienLeTan\n"
                + "where IDLeTan =?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deleteNVPV(String pid) {
        String query = "delete from NhanVienPhucVu\n"
                + "where IDPhucVu =?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void deleteThuePhong(String pid) {
        String query = "delete from ThuePhong\n"
                + "where IDThuePhong =?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
//

    public void insertNVLT(String id, String name, String gioiTinh, String image, String birthDate, String email, String address, String phone, String country) {
        String query = "INSERT [dbo].[NhanVienLeTan] ([IDLeTan], [TenLeTan], [GioiTinh], [ImgNhanVienLeTan], [NgaySinh], [Email], [DiaChi], [SDT],[QuocTich]) \n"
                + "VALUES (?,?,?,?,?,?,?,?,?) ";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, gioiTinh);
            ps.setString(4, image);
            ps.setString(5, birthDate);
            ps.setString(6, email);
            ps.setString(7, address);
            ps.setString(8, phone);
            ps.setString(9, country);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertNVDV(String id, String name, String gioiTinh, String image, String birthDate, String email, String address, String phone, String idPhong, String country) {
        String query = "INSERT [dbo].[NhanVienPhucVu] ([IDPhucVu], [TenPhucVu], [GioiTinh], [ImgNhanVienPhucVu], [NgaySinh], [Email], [DiaChi], [SDT],[IDPhong],[QuocTich]) \n"
                + "VALUES (?,?,?,?,?,?,?,?,?,?) ";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, gioiTinh);
            ps.setString(4, image);
            ps.setString(5, birthDate);
            ps.setString(6, email);
            ps.setString(7, address);
            ps.setString(8, phone);
            ps.setString(9, idPhong);
            ps.setString(10, country);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateKhachHang(String name, String address, String gioiTinh, String cmnd, String phone, String email, String country, String iDKhachHang) {
        String query = "update [dbo].[KhachHangg] \n"
                + "set TenKhachHang = ?,\n"
                + "DiaChi = ?,\n"
                + "GioiTinh = ?,\n"
                + "CMND = ?,\n"
                + "SDT = ?,\n"
                + "Email = ?,\n"
                + "QuocTich = ?\n"
                + "where IDKhachHang = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, gioiTinh);
            ps.setString(4, cmnd);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setString(7, country);
            ps.setString(8, iDKhachHang);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertThuePhong(String idKhach) {
        String query = "INSERT [dbo].[ThuePhong] ([IDKhach] , [TrangThai]) \n"
                + "VALUES (?, 0) ";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idKhach);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertDichVuPhong(String iDDichVu, int idThuePhong, String soLuongDichVu, int iDChiTietThuePhong) {
        String query = "insert dbo.DichVuPhong ([IDDichVu],[IDThuePhong],[SoLuongDichVu],[IDChiTietThuePhong])\n"
                + "values (?,?,?,?)";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, iDDichVu);
            ps.setInt(2, idThuePhong);
            ps.setString(3, soLuongDichVu);
            ps.setInt(4, iDChiTietThuePhong);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRoomNotExist(String idPhong) {
        String query = "update Phong\n"
                + "set TinhTrang = 1\n"
                + "where IDPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhong);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateTinhTrangChiTietThuePhongByIDThuePhong(int pid) {
        String query = "UPDATE ChiTietThuePhong\n"
                + "SET ChiTietThuePhong.TinhTrangChiTietThuePhong = 0\n"
                + "WHERE IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateRoomExist(String idPhong) {
        String query = "update Phong\n"
                + "set TinhTrang = 0\n"
                + "where IDPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhong);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<NgayThangNam> getAllDateThuePhong() {
        List<NgayThangNam> list = new ArrayList<>();
        String query = "select NgayNhanPhong, NgayTraPhong from ThuePhong";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
                Date d1 = sdformat.parse(rs.getString(1));
                Date d2 = sdformat.parse(rs.getString(2));
                list.add(new NgayThangNam(d1, d2));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int tinhNgaySuDung(int pid) {

        int result = 0;
        String query = "select DATEDIFF(day, ChiTietThuePhong.NgayNhanPhong,ChiTietThuePhong.NgayTraPhong) from dbo.ChiTietThuePhong, dbo.Phong, dbo.LoaiPhong , dbo.NgayDaDatPhong\n"
                + "where ChiTietThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and Phong.IDPhong = NgayDaDatPhong.IDPhong and ChiTietThuePhong.NgayNhanPhong = NgayDaDatPhong.NgayNhanPhong \n"
                + "and ChiTietThuePhong.NgayTraPhong = NgayDaDatPhong.NgayTraPhong and IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Float> layGiaTienPhong(String pid) {
        List<Float> list = new ArrayList<>();
        String query = "select GiaPhong from dbo.ThuePhong, dbo.Phong, dbo.LoaiPhong \n"
                + "where ThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and IDKhach = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getFloat(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Float> layGiaTienDichVuPhong(String pid) {
        List<Float> list = new ArrayList<>();
        String query = "select GiaDichVu from dbo.ThuePhong, dbo.Phong, dbo.LoaiPhong , dbo.DichVu , dbo.DichVuPhong\n"
                + "where ThuePhong.IDPhong = Phong.IDPhong and Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong and DichVu.IDDichVu = DichVuPhong.IDDichVu \n"
                + "and  DichVuPhong.IDThuePhong = ThuePhong.IDThuePhong and IDKhach = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getFloat(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void editEmployeeLT(String name, String gioiTinh, String img, String ngaySinh, String email, String diaChi, String phone, String quocTich, String pid) {
        String query = "update NhanVienLeTan\n"
                + "set TenLeTan = ?,\n"
                + "GioiTinh = ?,\n"
                + "ImgNhanVienLeTan = ?,\n"
                + "NgaySinh = ?,\n"
                + "Email = ?,\n"
                + "DiaChi = ? ,\n"
                + "SDT = ?,\n"
                + "QuocTich = ?\n"
                + "where IDLeTan = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gioiTinh);
            ps.setString(3, img);
            ps.setString(4, ngaySinh);
            ps.setString(5, email);
            ps.setString(6, diaChi);
            ps.setString(7, phone);
            ps.setString(8, quocTich);
            ps.setString(9, pid);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editRoom(String IDPhucVu, String IDLoaiPhong, String GiaPhong, String IDPhong) {
        String query = "update Phong\n"
                + "set IDPhucVu = ?,\n"
                + "TinhTrang = 0,\n"
                + "IDLoaiPhong = ?,\n"
                + "GiaPhong = ?\n"
                + "where IDPhong =?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, IDPhucVu);
            ps.setString(2, IDLoaiPhong);
            ps.setString(3, GiaPhong);
            ps.setString(4, IDPhong);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editEmployeePV(String name, String gioiTinh, String img, String idPhong, String ngaySinh, String email, String diaChi, String phone, String quocTich, String pid) {
        String query = "update NhanVienPhucVu\n"
                + "set TenPhucVu = ?,\n"
                + "ImgNhanVienPhucVu = ?,\n"
                + "GioiTinh = ?,\n"
                + "NgaySinh = ?,\n"
                + "Email = ?,\n"
                + "DiaChi = ? ,\n"
                + "SDT = ?,\n"
                + "IDPhong = ?,\n"
                + "QuocTich = ?\n"
                + "where IDPhucVu = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, img);
            ps.setString(3, gioiTinh);
            ps.setString(4, ngaySinh);
            ps.setString(5, email);
            ps.setString(6, diaChi);
            ps.setString(7, phone);
            ps.setString(8, idPhong);
            ps.setString(9, quocTich);
            ps.setString(10, pid);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editInformationKhachHang(String name, String gioiTinh, String email, String diaChi, String phone, String quocTich, String pid, String cmnd) {
        String query = "update KhachHangg\n"
                + "set TenKhachHang = ?,\n"
                + "DiaChi = ?,\n"
                + "GioiTinh = ?,\n"
                + "CMND = ? ,\n"
                + "SDT = ?,\n"
                + "Email = ?,\n"
                + "QuocTich = ?\n"
                + "where IDKhachHang = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, diaChi);
            ps.setString(3, gioiTinh);
            ps.setString(4, cmnd);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setString(7, quocTich);
            ps.setString(8, pid);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editInformationAccount(String email, String phone, String pid) {
        String query = "update Account\n"
                + "                set umobile = ?,\n"
                + "                uemail = ?\n"
                + "                where uname = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            ps.setString(2, email);
            ps.setString(3, pid);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editLoaiPhong(String TenLoaiPhong, String TrangBi, String ImgLoaiPhong, String SoNguoi, String pid) {
        String query = "update LoaiPhong \n"
                + "set TenLoaiPhong = ?, \n"
                + "    TrangBi = ?, \n"
                + "    ImgLoaiPhong = ?, \n"
                + "    SoNguoi = ? \n"
                + "where IDLoaiPhong = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, TenLoaiPhong);
            ps.setString(2, TrangBi);
            ps.setString(3, ImgLoaiPhong);
            ps.setString(4, SoNguoi);
            ps.setString(5, pid);
            int check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Account> checkAccountByEmail(String email) {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account\n"
                + "where uemail = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt("ID"), rs.getString("uname"), rs.getString("upass"), rs.getString("uemail"), rs.getString("umobile"),
                        rs.getInt("isStaff"), rs.getInt("isAdmin")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> checkAccountExistByList(String user) {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account\n"
                + "where uname = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt("ID"), rs.getString("uname"), rs.getString("upass"), rs.getString("uemail"), rs.getString("umobile"),
                        rs.getInt("isStaff"), rs.getInt("isAdmin")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> checkAccountAndEmailExistByList(String user, String email) {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account\n"
                + "where uname = ? and uemail =?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt("ID"), rs.getString("uname"), rs.getString("upass"), rs.getString("uemail"), rs.getString("umobile"),
                        rs.getInt("isStaff"), rs.getInt("isAdmin")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<NgayThangNam> getDateThuePhongByID(String pid) {
        List<NgayThangNam> list = new ArrayList<>();
        String query = "select NgayNhanPhong, NgayTraPhong from dbo.ThuePhong\n"
                + "where idPhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
                Date d1 = sdformat.parse(rs.getString(1));
                Date d2 = sdformat.parse(rs.getString(2));
                list.add(new NgayThangNam(d1, d2));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<NgayDaDatPhong> getDateNgayDaDatPhongByIDPhong(String pid) {
        List<NgayDaDatPhong> list = new ArrayList<>();
        String query = "select *from NgayDaDatPhong\n"
                + "where IDPhong=? ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NgayDaDatPhong(rs.getString("IDPhong"), rs.getString("NgayNhanPhong"), rs.getString("NgayTraPhong")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<DichVuPhongDaDuocThue> getDichVuPhongDaDuocThueByID(int pid) {
        List<DichVuPhongDaDuocThue> list = new ArrayList<>();
        String query = "select * from DichVuPhong, DichVu, ChiTietThuePhong\n"
                + "where DichVuPhong.IDDichVu = DichVu.IDDichVu and ChiTietThuePhong.IDChiTietThuePhong = DichVuPhong.IDChiTietThuePhong and DichVuPhong.IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DichVuPhongDaDuocThue(rs.getString("IDDichVuPhong"), rs.getString("IDPhong"), rs.getString("IDDichVu"), rs.getInt("SoLuongDichVu"),
                        rs.getString("TenDichVu"), rs.getFloat("GiaDichVu"), rs.getString("DesDichVu"), rs.getString("ImgDichVu"), rs.getInt("IDChiTietThuePhong")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<DichVuPhongDaDuocThue> getDichVuPhongDaDuocThueByIDThuePhong(int pid) {
        List<DichVuPhongDaDuocThue> list = new ArrayList<>();
        String query = "select * from DichVuPhong, DichVu, ChiTietThuePhong\n"
                + "where DichVuPhong.IDDichVu = DichVu.IDDichVu and ChiTietThuePhong.IDChiTietThuePhong = DichVuPhong.IDChiTietThuePhong and DichVuPhong.IDChiTietThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DichVuPhongDaDuocThue(rs.getString("IDDichVuPhong"), rs.getString("IDPhong"), rs.getString("IDDichVu"), rs.getInt("SoLuongDichVu"),
                        rs.getString("TenDichVu"), rs.getFloat("GiaDichVu"), rs.getString("DesDichVu"), rs.getString("ImgDichVu"), rs.getInt("IDChiTietThuePhong")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<NgayThangNam> getNgayDaDatPhongByID(String pid) {
        List<NgayThangNam> list = new ArrayList<>();
        String query = "select NgayNhanPhong, NgayTraPhong from NgayDaDatPhong\n"
                + "where IDPhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
                Date d1 = sdformat.parse(rs.getString(1));
                Date d2 = sdformat.parse(rs.getString(2));
                list.add(new NgayThangNam(d1, d2));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<HoaDon> getHoaDonByID(int pid) {
        List<HoaDon> list = new ArrayList<>();
        String query = "select *from HoaDon , KhachHangg , ThuePhong\n"
                + "where KhachHangg.IDKhachHang = ThuePhong.IDKhach and HoaDon.IDThuePhong = ThuePhong.IDThuePhong and HoaDon.IDThuePhong = ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt("IDHoaDon"),
                        rs.getFloat("TongTien"), rs.getFloat("TienTraTruoc"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getString("MaHoaDonTotal"),
                        rs.getString("DateDatCoc"),
                        rs.getString("DateTotal"),
                        rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich")));

            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<HoaDon> getHoaDonByIDHoaDon(int pid) {
        List<HoaDon> list = new ArrayList<>();
        String query = "select *from HoaDon , KhachHangg , ThuePhong\n" +
"            where KhachHangg.IDKhachHang = ThuePhong.IDKhach and HoaDon.IDThuePhong = ThuePhong.IDThuePhong and HoaDon.IDHoaDon= ?";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt("IDHoaDon"),
                        rs.getFloat("TongTien"), rs.getFloat("TienTraTruoc"),
                        rs.getString("MaHoaDonDatCoc"),
                        rs.getString("MaHoaDonTotal"),
                        rs.getString("DateDatCoc"),
                        rs.getString("DateTotal"),
                        rs.getInt("IDThuePhong"),
                        rs.getString("IDKhachHang"),
                        rs.getString("IDKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getString("DiaChi"),
                        rs.getString("GioiTinh"),
                        rs.getString("CMND"), rs.getString("SDT"), rs.getString("Email"), rs.getString("QuocTich")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {

        DAO dao = new DAO();

        List<HoaDon> a = dao.getHoaDonByIDHoaDon(31);
        for (HoaDon aa : a) {
            System.out.println(a);

        }
//       dao.updatePhongDaThanhToan("759");
    }
}
