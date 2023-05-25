/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import static context.DatabaseInfor.driverName;
import static context.DatabaseInfor.pass;
import static context.DatabaseInfor.url;
import static context.DatabaseInfor.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class dbcontext implements DatabaseInfor {

    private static Connection connection = null;

    private static dbcontext instance;

    public dbcontext() {
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Apple iphone", "sa", "123456");
            System.out.print("connected");
        }
        return connection;
    }

    //Get instance of dbms only one time
    public static dbcontext getInstance() {
        if (instance == null) {
            instance = new dbcontext();
        }
        return instance;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
