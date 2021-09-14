package ar.com.ada.api.netflis.repos;

import org.springframework.stereotype.Repository;


import ar.com.ada.api.netflis.entities.Serie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface SerieRepository extends MongoRepository <Serie,ObjectId> {
    Serie findBy_id(ObjectId id);
}