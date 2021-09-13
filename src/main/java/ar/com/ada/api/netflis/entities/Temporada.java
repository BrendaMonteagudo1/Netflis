package ar.com.ada.api.netflis.entities;

import java.util.*;

public class Temporada extends Serie {
    

    private Integer numero;
    public String nombre; //Esto es el nombre de la temporada y no del capitulo
    public List<Episodio> episodios  = new ArrayList<>();


    public Episodio buscarEpisodio(Integer numeroEpisodio){
    
        for (Episodio episodio : this.episodios){
            if (episodio.getNumero() == numeroEpisodio)
                return episodio;
        }
        return null;
    }


  // GET Y SET DE NUMERO

    public Integer getNumero(){
    return this.numero;
    }

    public void setNumero(Integer numero){
    this.numero = numero;
    }


}
