package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Framework.AppException;

public abstract class SQLiteDataHelper {
    private final String RUTA_DATABASE = "jdbc:sqlite:database\\BaseDatos.db"; 
    private Connection conn = null;
    private Statement stmt;
    private ResultSet rs;
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
    
    public abstract ResultSet readRegistrosActivos() throws AppException;

}
