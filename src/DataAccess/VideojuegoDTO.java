package DataAccess;

import java.sql.ResultSet;

import Framework.AppException;

public class VideojuegoDTO extends SQLiteDataHelper {

    @Override
    public ResultSet readRegistrosActivos() throws AppException {
        consultaSQL =   " SELECT v.IdJuego, v.Nombre, e.Nombre, p.Nombre, v.AnioLanzamiento, v.VentasEstimadas "
                      + " FROM   VIDEOJUEGO v " 
                      + " JOIN   EMPRESA e     ON v.IdEmpresa    = e.IdEmpresa "
                      + " JOIN   PLATAFORMA p  ON v.IdPlataforma = p.IdPlataforma"
                      + " WHERE  v.Estado = 1 ";
        return getResultSet(consultaSQL);
    }

    
}
