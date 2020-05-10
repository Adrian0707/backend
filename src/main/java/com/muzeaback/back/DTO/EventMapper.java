package com.muzeaback.back.DTO;
import com.muzeaback.back.Entity.EventEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDTO toDto(EventEntity eventEntity);
    EventEntity toEntity(EventDTO eventDTO);
    List<EventDTO> toDto(List<EventEntity> eventEntities);
    List<EventEntity> toEntity(List<EventDTO> eventDTOS);

}
