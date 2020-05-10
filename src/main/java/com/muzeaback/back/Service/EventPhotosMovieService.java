package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.*;
import com.muzeaback.back.Entity.EventEntity;
import com.muzeaback.back.Repository.EventRepo;
import com.muzeaback.back.Repository.MovieRepo;
import com.muzeaback.back.Repository.PhotosRepo;
import com.muzeaback.back.Repository.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventPhotosMovieService {
    private EventRepo eventRepo;
    private EventMapper eventMapper;
    private PhotosMapper photosMapper;
    private PhotosRepo photosRepo;
    private MovieMapper movieMapper;
    private MovieRepo movieRepo;

    @Autowired
    public EventPhotosMovieService(EventRepo eventRepo,EventMapper eventMapper,
                                   PhotosMapper photosMapper, PhotosRepo photosRepo,
                                   MovieMapper movieMapper, MovieRepo movieRepo){
        this.eventMapper=eventMapper;
        this.eventRepo=eventRepo;
        this.movieMapper=movieMapper;
        this.movieRepo=movieRepo;
        this.photosMapper=photosMapper;
        this.photosRepo=photosRepo;


    }

    public boolean postEventPhotosMovies(EventPhotosMoviesDTO eventPhotosMoviesDTO){
        EventEntity currentEventEntity=eventMapper.toEntity(eventPhotosMoviesDTO.getEventDTO());
        if(!eventRepo.existsEventEntitiesByNameAndDateStartAndDateEndAndPlaceByIdplace(currentEventEntity.getName(),currentEventEntity.getDateStart(),
                currentEventEntity.getDateEnd(),currentEventEntity.getPlaceByIdplace())) {

            eventRepo.save(currentEventEntity);



            currentEventEntity =eventRepo.findByPlaceByIdplaceAndNameAndDateStartAndDateEnd(currentEventEntity.getPlaceByIdplace(),
                    currentEventEntity.getName(), currentEventEntity.getDateStart(), currentEventEntity.getDateEnd());


            for (PhotosDTO photo : eventPhotosMoviesDTO.getPhotosDTOS()
            ) {
                photo.setEventByIdevent(currentEventEntity.getIdEvent());
                photosRepo.save(photosMapper.toEntity(photo));

            }
            for (MovieDTO movie : eventPhotosMoviesDTO.getMovieDTOS()
            ) {
                movie.setEventByIdevent(currentEventEntity.getIdEvent());
                movieRepo.save(movieMapper.toEntity(movie));

            }
            return true;
        }
        else return false;

    }
}
