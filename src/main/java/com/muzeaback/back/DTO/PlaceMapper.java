package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.PlaceEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface PlaceMapper {
    PlaceEntity toEntity(PlaceDTO placeDTO);
    PlaceDTO toDto(PlaceEntity placeEntity);
    List<PlaceDTO> toDto(List<PlaceEntity> movieEntity);
    List<PlaceEntity> toEntity(List<PlaceDTO> movieDTO);
}
