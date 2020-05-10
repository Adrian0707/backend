package com.muzeaback.back.Repository;

import com.muzeaback.back.Entity.PlaceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepo extends CrudRepository<PlaceEntity, Long> {
    List<PlaceEntity> findAllByUserByIduser(Long id);
    PlaceEntity findByIdPlace(Long id);
    List<PlaceEntity> findAll();
    List<PlaceEntity> findAllByName(String name);
}
