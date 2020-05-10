package com.muzeaback.back.Controller;

import com.muzeaback.back.DTO.EventDTO;
import com.muzeaback.back.DTO.EventMapper;
import com.muzeaback.back.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/event")
public class EventController {
    private EventService eventService;
@Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
    public List<EventDTO> getAllEvents(){
    return eventService.getAllEvents();
    }

    @GetMapping("/place/{id}")
    public List<EventDTO> getEventsByPlaceId(@PathVariable("id") Long id){
    return eventService.getAllByPlaceID(id);

    }
    @GetMapping("/time/{startT}/{endT}")
    public List<EventDTO> getEventsByStartTimeAndEndTime(
                @PathVariable("startT")  @DateTimeFormat(pattern="yyyy-MM-dd") java.util.Date startT,
                @PathVariable("endT")  @DateTimeFormat(pattern="yyyy-MM-dd") java.util.Date endT) {
        return eventService.getAllEventsBetwen(startT, endT);
    }
    @GetMapping("name/{name}")
    public List<EventDTO> getEventByName(@PathVariable("name") String name){
    return eventService.getByName(name);

    }
    @GetMapping("/id/{id}")
    public EventDTO getEventById(@PathVariable("id") Long id){
        return eventService.getByIdEvent(id);}
    @GetMapping("name/{name}/place/{id}/")
        public List<EventDTO> getEventByNameAndPlaceId(
                @PathVariable("name") String name,
                @PathVariable("id") Long id){
    return eventService.getAllByPlaceByIdplaceAndName(id,name);
    }
    @GetMapping("name/{name}/place/{id}/time/{startT}/{endT}")
    public List<EventDTO> getAllEventbyNameAndPlaceIdAndStartTAndEndT(@PathVariable("name") String name,
                                 @PathVariable("id") Long id,
                                 @PathVariable("startT") Date startT,
                                 @PathVariable("endT") Date endT){
    return eventService.getAllByPlaceByIdplaceAndNameAndDateStartAndDateEnd(id,name,startT,endT);
    }


    @GetMapping("place/name/{name}")
    public List<EventDTO> getEventByPlaceName(@PathVariable("name") String name){
    return eventService.getEventByPlaceName(name);
    }
    @PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void post(@RequestBody EventDTO eventDTO){
        eventService.postEvent(eventDTO);}
}
