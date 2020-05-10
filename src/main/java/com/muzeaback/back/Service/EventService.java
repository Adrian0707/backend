package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.EventDTO;
import com.muzeaback.back.DTO.EventMapper;
import com.muzeaback.back.DTO.PlaceMapper;
import com.muzeaback.back.Entity.EventEntity;
import com.muzeaback.back.Entity.PlaceEntity;
import com.muzeaback.back.Repository.EventRepo;
import com.muzeaback.back.Repository.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private EventRepo eventRepo;
    private EventMapper eventMapper;
    private PlaceRepo placeRepo;
    private PlaceMapper placeMapper;

    @Autowired
    public EventService(EventRepo eventRepo,EventMapper eventMapper, PlaceRepo placeRepo, PlaceMapper placeMapper){
        this.eventMapper=eventMapper;
        this.eventRepo=eventRepo;
        this.placeMapper=placeMapper;
        this.placeRepo=placeRepo;

    }
    public List<EventDTO> getAllByPlaceID(Long id){
        return eventMapper.toDto(eventRepo.findAllByPlaceByIdplace(id));}
        
    public List<EventDTO> getAllByDateStartAndDateEnd(Date start, Date end){
        return eventMapper.toDto(eventRepo.findAllByDateStartAndDateEnd( start, end));
    }
    public List<EventDTO> getByName(String name){
        return eventMapper.toDto(eventRepo.findByName( name));
    }
    public EventDTO getByIdEvent(Long id){
        return  eventMapper.toDto(eventRepo.findByIdEvent( id));
    }
    public List<EventDTO> getAllByPlaceByIdplaceAndName(Long id,String name){
        return  eventMapper.toDto(eventRepo.findAllByPlaceByIdplaceAndName(id,name));
    }
    public List<EventDTO> getAllByPlaceByIdplaceAndNameAndDateStartAndDateEnd(Long id,String name,Date start,Date end){
        return  eventMapper.toDto(eventRepo.findAllByPlaceByIdplaceAndNameAndDateStartAndDateEnd(id,name,start,end));
    }
    public void postEvent(EventDTO eventDTO){
       // EventDTO eventDTO = new EventDTO( name,  dateStart,  dateEnd,  description);
        eventRepo.save(eventMapper.toEntity(eventDTO));
    }
    public List<EventDTO> getAllEvents(){
        return eventMapper.toDto(eventRepo.findAllBy());
    }
    public List<EventDTO> getEventByPlaceName(String placeName){
        List<PlaceEntity> places = placeRepo.findAllByName(placeName);
        List<EventEntity> events= new ArrayList<EventEntity>();
        for (PlaceEntity p: places
             ) {
            events.addAll(eventRepo.findAllByPlaceByIdplace(p.getIdPlace()));
        }
        return eventMapper.toDto(events);
    }
    public List<EventDTO> getAllEventsBetwen(java.util.Date start, java.util.Date end){
        List<EventEntity> events = eventRepo.findAllByDateEndIsBetween(start,end);
        List<EventEntity> events2=eventRepo.findAllByDateStartAndDateEnd(start,end);
        for (EventEntity e: events2
             ) {
            if(!events.contains(e)){
                events.add(e);
            }
        }
        return eventMapper.toDto(events);

    }

}
