package DataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppException;

public class VideojuegoDTO extends SQLiteDataHelper {

    public ResultSet readRegistrosActivos(int min, int max) throws AppException, SQLException {
        
        consultaSQL = " SELECT v.IdJuego, v.Nombre, e.Nombre, p.Nombre, v.AnioLanzamiento, v.VentasEstimadas "
                + " FROM   VIDEOJUEGO v "
                + " JOIN   EMPRESA e     ON v.IdEmpresa    = e.IdEmpresa "
                + " JOIN   PLATAFORMA p  ON v.IdPlataforma = p.IdPlataforma"
                + " WHERE  v.IdJuego BETWEEN ? AND ? "
                + " AND    v.Estado = 1 ";
        conn = getConnection();
        ps = conn.prepareStatement(consultaSQL);
        ps.setInt(1, min);
        ps.setInt(2, max);
        return ps.executeQuery();
    }

    public ResultSet readCountFilas() throws AppException {
        consultaSQL = " SELECT COUNT(*) FROM VIDEOJUEGO WHERE Estado = 1 ";
        return getResultSet(consultaSQL);
    }

}
