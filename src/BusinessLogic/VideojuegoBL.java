package BusinessLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Videojuego;
import DataAccess.VideojuegoDTO;
import Framework.AppException;

public class VideojuegoBL {
    private VideojuegoDTO videojuegoDTO;

    public VideojuegoBL() {
        videojuegoDTO = new VideojuegoDTO();
    }
    
    public List<Videojuego> getRegistrosActivos() throws AppException {
        
        try {
            List<Videojuego> listaVideojuegos = new ArrayList<>();
            ResultSet rs = videojuegoDTO.readRegistrosActivos();
            Videojuego videojuego;

            while(rs.next())    {
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
        } 
        catch (Exception e) {
            throw new AppException(e, getClass(),"getRegistrosActivos()");
        }

    }
}
