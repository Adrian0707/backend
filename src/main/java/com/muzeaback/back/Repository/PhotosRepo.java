package com.muzeaback.back.Repository;

import com.muzeaback.back.Entity.PhotosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotosRepo extends CrudRepository<PhotosEntity, Long> {
    List<PhotosEntity> findAllByEventByIdevent(Long id);
    PhotosEntity findByIdphotos(Long id);
}
