package com.muzeaback.back.Repository;

import com.muzeaback.back.Entity.EventEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface EventRepo extends CrudRepository<EventEntity, Long> {
    List<EventEntity> findAllByPlaceByIdplace(Long id);
    List<EventEntity> findAllByDateStartAndDateEnd(Date start,Date end);
    List<EventEntity> findByName(String name);
    EventEntity findByIdEvent(Long id);
    List<EventEntity> findAllByPlaceByIdplaceAndName(Long id,String name);
    List<EventEntity> findAllByPlaceByIdplaceAndNameAndDateStartAndDateEnd(Long id,String name,Date start,Date end);
    EventEntity findByPlaceByIdplaceAndNameAndDateStartAndDateEnd(Long id,String name,Date start,Date end);
    List<EventEntity> findAllBy();
    List<EventEntity> findAllByDateStartIsBetween(Date start,Date end);
    List<EventEntity> findAllByDateEndIsBetween(Date start,Date end);
    boolean existsEventEntitiesByNameAndDateStartAndDateEndAndPlaceByIdplace(String name,Date start,Date end,Long idPlace);

}
