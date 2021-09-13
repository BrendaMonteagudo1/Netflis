package ar.com.ada.api.netflis.repos;

import org.springframework.stereotype.Repository;

import ar.com.ada.api.netflis.entities.Pelicula;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface PeliculaRepository extends MongoRepository <Pelicula,ObjectId> {
    
    Pelicula crearPelicula(Pelicula pelicula);
}