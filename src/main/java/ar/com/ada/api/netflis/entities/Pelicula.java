package ar.com.ada.api.netflis.entities;
import java.util.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pelicula")
public class Pelicula extends Contenido {

    @JsonSerialize(using = ToStringSerializer.class) //convertidor a String ya que _id es objectId
    private ObjectId _id;
    
    private int duracion;

    private Director director;

    public boolean filmadaEnIMAX;



    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public boolean isFilmadaEnIMAX() {
        return filmadaEnIMAX;
    }
    public void setFilmadaEnIMAX(boolean filmadaEnIMAX) {
        this.filmadaEnIMAX = filmadaEnIMAX;
    }


}
