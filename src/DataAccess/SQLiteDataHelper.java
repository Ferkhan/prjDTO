package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Framework.AppException;

public abstract class SQLiteDataHelper {
    private final String RUTA_DATABASE = "jdbc:sqlite:database\\BaseDatos.db"; 
    protected Connection conn = null;
    protected Statement stmt;
    protected ResultSet rs;
    protected PreparedStatement ps;
    protected String consultaSQL;

    protected Connection getConnection() throws AppException {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(RUTA_DATABASE);
            }
    
        } catch (Exception e) {
            throw new AppException(e, getClass(), "getConnection()");
        }

        return conn;
    }


    protected ResultSet getResultSet (String consultaSQL) throws AppException {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs   = stmt.executeQuery(consultaSQL);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getResultSet()");
        }

        return rs;
    }
    

}
