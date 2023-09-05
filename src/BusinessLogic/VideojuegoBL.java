package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Videojuego;
import DataAccess.VideojuegoDTO;
import Framework.AppException;

public class VideojuegoBL {

    public List<Videojuego> getRegistros(int min, int max) throws AppException {

        try {
            List<Videojuego> listaVideojuegos = new ArrayList<>();
            ResultSet rs = new VideojuegoDTO().readRegistrosActivos(min, max);
            Videojuego videojuego;
            while (rs.next()) {
                videojuego = new Videojuego();
                videojuego.setId(rs.getInt(1));
                videojuego.setNombre(rs.getString(2));
                videojuego.setDistribuidor(rs.getString(3));
                videojuego.setPlataforma(rs.getString(4));
                videojuego.setAnioLanzamiento(rs.getString(5));
                videojuego.setVentasEstimadas(rs.getInt(6));

                listaVideojuegos.add(videojuego);
            }
            return listaVideojuegos;
        } catch (Exception error) {
            throw new AppException(error, getClass(), "getRegistrosActivos()");
        }
    }

    public int getCountFilas() throws SQLException, AppException {
        ResultSet rs = new VideojuegoDTO().readCountFilas();
        return rs.getInt(1);
    }

}
