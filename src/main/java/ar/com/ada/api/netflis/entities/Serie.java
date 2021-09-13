package ar.com.ada.api.netflis.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


@Document(collection = "Series")
public class Serie {

    @JsonSerialize(using = ToStringSerializer.class) //convertidor a String ya que _id es objectId
    private ObjectId _id;

    private Temporada temporada;

    private String nombre;

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
