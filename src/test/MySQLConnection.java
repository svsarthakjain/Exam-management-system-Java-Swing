
package test;


import java.sql.*;


/**
 *
 * @author Majey
 */
public class MySQLConnection {
      public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "miniexammanagement";
        //String dbUrl = dbRoot+hostName+dbName;
        String dbUrl = dbRoot + hostName + dbName + "?characterEncoding=latin1";
        String hostUsername = "root";
        String hostPassword = "pass";
        
        //Class.forName("com.mysql.jdbc.Driver");
        Connection myConn=null;
         myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);

        return myConn;
    }
}
