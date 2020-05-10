package com.muzeaback.back.DTO;

import org.springframework.ui.Model;

import java.util.Date;


public class EventPhotosMoviesDTO {
    private EventDTO eventDTO;
    private MovieDTO movieDTOS[];
    private PhotosDTO photosDTOS[];

    public EventPhotosMoviesDTO(EventDTO eventDTO, MovieDTO[] movieDTOS, PhotosDTO[] photosDTOS) {
       this.eventDTO = eventDTO;
        this.movieDTOS = movieDTOS;
        this.photosDTOS = photosDTOS;
    }

    public EventDTO getEventDTO() {
        return eventDTO;
    }

    public void setEventDTO(EventDTO eventDTO) {
        this.eventDTO = eventDTO;
    }

    public MovieDTO[] getMovieDTOS() {
        return movieDTOS;
    }

    public void setMovieDTOS(MovieDTO[] movieDTOS) {
        this.movieDTOS = movieDTOS;
    }

    public PhotosDTO[] getPhotosDTOS() {
        return photosDTOS;
    }

    public void setPhotosDTOS(PhotosDTO[] photosDTOS) {
        this.photosDTOS = photosDTOS;
    }

    public EventPhotosMoviesDTO() {
    }
}
