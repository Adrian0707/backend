package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.PhotosEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface PhotosMapper {
    PhotosDTO toDto(PhotosEntity photosEntity);
    PhotosEntity toEntity(PhotosDTO photosDTO);
    List<PhotosDTO> toDto(List<PhotosEntity> movieEntity);
    List<PhotosEntity> toEntity(List<PhotosDTO> movieDTO);
}
