/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DBContext {
     private final String serverName = "localhost";
    private static final String portName = "1433";
    private static final String dbName = "QuizSystem";
    private static final String userName = "sa";

    private static final String password = "123456";

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String url = "jdbc:sqlserver://" + serverName + ":" + portName + ";databaseName = "
                + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userName, password);
    }
    
}
