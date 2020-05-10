package com.muzeaback.back.Controller;


import com.muzeaback.back.DTO.EventDTO;
import com.muzeaback.back.DTO.EventPhotosMoviesDTO;
import com.muzeaback.back.DTO.MovieDTO;
import com.muzeaback.back.DTO.PhotosDTO;
import com.muzeaback.back.Service.EventPhotosMovieService;
import com.muzeaback.back.Service.EventService;
import javafx.geometry.Pos;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/event")
public class EventPhotosMoviesController {
    EventService eventService;
    EventPhotosMovieService eventPhotosMovieService;
    @Autowired
    public EventPhotosMoviesController(EventService eventService, EventPhotosMovieService eventPhotosMovieService) {
        this.eventService=eventService;
        this.eventPhotosMovieService=eventPhotosMovieService;
    }



    @GetMapping("/full")
    public EventPhotosMoviesDTO getEventsByPlaceId(){
        PhotosDTO[] photosDTOS = new PhotosDTO[5];
        MovieDTO[] movieDTOS = new MovieDTO[5];
        for(int i =0 ;i<5; i++) {
            photosDTOS[i]= new PhotosDTO("dfdfdfsfdf",new Long(1));
            movieDTOS[i]= new MovieDTO("dfdfdfsfdf",new Long(1));
        }
        EventDTO eventDTO = new EventDTO(null,"BigEvent",new Date(1,2,3),
               new Date(1,2,3),"BigGo",new Long(1));

        EventPhotosMoviesDTO eventPhotosMoviesDTO = new EventPhotosMoviesDTO(eventDTO,movieDTOS,photosDTOS);
        return eventPhotosMoviesDTO;



    }
    @PostMapping(value = "/full",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean post(@RequestBody EventPhotosMoviesDTO eventPhotosMoviesDTO){
      return eventPhotosMovieService.postEventPhotosMovies(eventPhotosMoviesDTO);}
}
