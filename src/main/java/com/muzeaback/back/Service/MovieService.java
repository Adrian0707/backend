package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.MovieDTO;
import com.muzeaback.back.DTO.MovieMapper;
import com.muzeaback.back.Entity.EventEntity;
import com.muzeaback.back.Entity.MovieEntity;
import com.muzeaback.back.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepo movieRepo;
    MovieMapper movieMapper;

    @Autowired
    public MovieService(MovieRepo movieRepo, MovieMapper movieMapper) {
        this.movieRepo = movieRepo;
        this.movieMapper = movieMapper;
    }
    public List<MovieDTO> getAllByEventByIdevent(Long id){
        return movieMapper.toDto(movieRepo.findAllByEventByIdevent(id));
    }
    public MovieDTO getByIdmovie(Long id){
        return  movieMapper.toDto(movieRepo.findByIdmovie(id));
    }

    public void postMovie(MovieDTO movieDTO){
        //MovieDTO movieDTO=new MovieDTO( path, eventByIdevent);
        movieRepo.save(movieMapper.toEntity(movieDTO));
    }

}
