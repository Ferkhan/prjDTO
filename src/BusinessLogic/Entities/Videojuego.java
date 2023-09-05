package BusinessLogic.Entities;

public class Videojuego {
    private int 
                id,
                ventasEstimadas;
    
    private String 
                nombre,
                distribuidor,
                plataforma,
                anioLanzamiento;

    public int getVentasEstimadas() {
        return ventasEstimadas;
    }

    public void setVentasEstimadas(int ventasEstimadas) {
        this.ventasEstimadas = ventasEstimadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(String anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
               
}
