/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.dbcontext;
import entity.Account;
import entity.DichVu;
import entity.NhanVienLeTan;
import entity.NhanVienPhucVu;
import entity.Phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String query = "select * from\n" +
"dbo.Phong , dbo.LoaiPhong\n" +
"where Phong.IDLoaiPhong = LoaiPhong.IDLoaiPhong  ";
        try {
            conn = new dbcontext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phong(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                ));
            }
        } catch (Exception e) {
        }
        return list;
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
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9) ));
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
//
//    
//
//    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
//        List<Cart> products = new ArrayList<>();
//        try {
//            if (cartList.size() > 0) {
//                for (Cart item : cartList) {
//                    query = "select * from Product where id=?";
//                    ps = this.con.prepareStatement(query);
//                    ps.setInt(1, item.getId());
//                    rs = ps.executeQuery();
//                    while (rs.next()) {
//                        Cart row = new Cart();
//                        row.setImage(rs.getString("image"));
//                        row.setId(rs.getInt("id"));
//                        row.setName(rs.getString("name"));
//                        row.setPrice(rs.getDouble("price") * item.getQuantity());
//                        row.setQuantity(item.getQuantity());
//                        products.add(row);
//                    }
//
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        return products;
//    }
//
//    public double getTotalCartPrice(ArrayList<Cart> cartList) {
//        double sum = 0;
//        try {
//            if (cartList.size() > 0) {
//                for (Cart item : cartList) {
//                    query = "select price from Product where id=?";
//                    ps = this.con.prepareStatement(query);
//                    ps.setInt(1, item.getId());
//                    rs = ps.executeQuery();
//                    while (rs.next()) {
//                        sum += rs.getDouble("price") * item.getQuantity() + 110;
//                    }
//
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        return sum;
//    }
//
//    public List<Product> getAllProductCID(String cid) {
//        List<Product> list = new ArrayList<>();
//        String query = "select * from Product\n"
//                + "where cateID = ?";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            // truyen cai id vao ?
//            ps.setString(1, cid);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//
//    public List<Product> getAllProductSellID(int id) {
//        List<Product> list = new ArrayList<>();
//        String query = "select * from Product\n"
//                + "where sell_ID = ?";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            // truyen cai id vao ?
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//
//    public List<Product> searchByName(String txtSearch) {
//        List<Product> list = new ArrayList<>();
//        String query = "select *from Product\n"
//                + "where [name] like ?";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            // truyen cai id vao ?
//            ps.setString(1, "%" + txtSearch + "%");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//
//    public Product getAllProductID(String id) {
//        List<Product> list = new ArrayList<>();
//        String query = "select * from Product\n"
//                + "where cateID = ?";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            // truyen cai id vao ?
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    public List<Category> getAllCategory() {
//        List<Category> list = new ArrayList<>();
//        String query = "select * from Category";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Category(rs.getInt(1),
//                        rs.getString(2)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//
//    public Product getLast() {
//        String query = "select top 1 * from Product\n"
//                + "order by id desc";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    public Product getProductByID(String id) {
//        String query = "select * from product\n"
//                + "where id = ?";
//        try {
//            conn = new dbcontext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
    public Account login(String user, String password) {
        String query = "select * from Account\n"
                + "where [uname] = ?\n"
                + "and upass = ?";
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
            rs = ps.executeQuery();
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

    public void singup(String user, String pass,String email,String phonenumber) {
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
    
            
        public void editPassword(String user, String newPassword) {
        String query =" update Account set upass= ? where uname = ?";
        try {
            conn = new dbcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, user);
             
            ps.executeUpdate();
           
            
        } catch (Exception e) {
        }
    }
        
//
//    public void deleteProduct(String pid) {
//        String query = "delete from Product\n"
//                + "where id =?";
//        try {
//            conn = new dbcontext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, pid);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//
//    }
//
//    public void insertProduct(int id, String name, String image, String price, String title, String description, String category, int sid) {
//        String query = "INSERT [dbo].[Product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID]) \n"
//                + "VALUES (?,?,?,?,?,?,?,?) ";
//        try {
//            conn = new dbcontext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, id);
//            ps.setString(2, name);
//            ps.setString(3, image);
//            ps.setString(4, price);
//            ps.setString(5, title);
//            ps.setString(6, description);
//            ps.setString(7, category);
//            ps.setInt(8, sid);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
//
//    public void editProduct(String name, String image, String price, String title, String description, String category, int pid) {
//        String query = "update Product\n"
//                + "set [name]= ?,\n"
//                + "[image] = ?,\n"
//                + "price = ?,\n"
//                + "title = ?,\n"
//                + "[description] = ?,\n"
//                + "cateID = ? \n"
//                + "where id = ? , ";
//        try {
//            conn = new dbcontext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, name);
//            ps.setString(2, image);
//            ps.setString(3, price);
//            ps.setString(4, title);
//            ps.setString(5, description);
//            ps.setString(6, category);
//            ps.setInt(7, pid);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
//
//    public Product getSingleProduct(int id) {
//        Product row = null;
//        try {
//            query = "select * from Product where id=? ";
//
//            ps = this.con.prepareStatement(query);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                row = new Product();
//                row.setId(rs.getInt("id"));
//                row.setName(rs.getString("name"));
//                row.setTitle(rs.getString("title"));
//                row.setPrice(rs.getDouble("price"));
//                row.setImage(rs.getString("image"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//
//        return row;
//    }
//
//    public boolean insertOrder(Order model) {
//        boolean result = false;
//        try {
//            query = "insert into orders(p_id, u_id, o_quantity) values(?,?,?)";
//
//            ps = this.con.prepareStatement(query);
//            ps.setInt(1, model.getId());
//            ps.setInt(2, model.getUid());
//            ps.setInt(3, model.getQuantity());
//            ps.executeUpdate();
//            result = true;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }
//
//    public List<Order> userOrders(int id) {
//        List<Order> list = new ArrayList<>();
//        try {
//            query = "select * from orders where u_id=? order by orders.o_id desc";
//            ps = this.con.prepareStatement(query);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Order order = new Order();
//                DAO productDao = new DAO(this.con);
//                int pId = rs.getInt("p_id");
//                Product product = productDao.getSingleProduct(pId);
//                order.setOrderId(rs.getInt("o_id"));
//                order.setId(pId);
//                order.setName(product.getName());
//                order.setTitle(product.getTitle());
//                order.setPrice(product.getPrice()+110 * rs.getInt("o_quantity"));
//                order.setQuantity(rs.getInt("o_quantity"));
//                list.add(order);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        return list;
//    }
//    public void cancelOrder( int id){
//        try {
//            query = "delete from orders where o_id=?";
//            ps = this.con.prepareStatement(query);
//            ps.setInt(1, id);
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        DAO dao = new DAO();

        List<DichVu> list = dao.getAllDichVu();
        for (DichVu o : list) {
            System.out.println(o);
        }
    }

}
