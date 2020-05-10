package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.MovieEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface MovieMapper {
    MovieDTO toDto(MovieEntity movieEntity);
    MovieEntity toEntity(MovieDTO movieDTO);
    List<MovieDTO> toDto(List<MovieEntity> movieEntity);
    List<MovieEntity> toEntity(List<MovieDTO> movieDTO);
}
