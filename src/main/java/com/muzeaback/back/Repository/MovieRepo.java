package com.muzeaback.back.Repository;

import com.muzeaback.back.Entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends CrudRepository<MovieEntity, Long> {
    List<MovieEntity> findAllByEventByIdevent(Long id);
    MovieEntity findByIdmovie(Long id);
}
