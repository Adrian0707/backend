package com.muzeaback.back;

import com.muzeaback.back.DTO.*;
import com.muzeaback.back.Entity.*;
import com.muzeaback.back.Repository.*;
import com.muzeaback.back.Service.EventService;
import com.muzeaback.back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Component

public class Start {
    private UserRepo userRepo;
    private EventRepo eventRepo;
    private PlaceRepo placeRepo;
    private MovieRepo movieRepo;
    private PhotosRepo photosRepo;
    private UserMapper userMapper;
    private PhotosMapper photosMapper;
    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private PlaceMapper placeMapper;
    @Autowired
    UserService userService ;
    @Autowired
    EventService eventService ;
    @Autowired
    public Start(UserRepo userRepo, EventRepo eventRepo, PlaceRepo placeRepo, MovieRepo movieRepo, PhotosRepo photosRepo,UserMapper userMapper
    ,PhotosMapper photosMapper) {
        this.userRepo = userRepo;
        this.eventRepo = eventRepo;
        this.placeRepo = placeRepo;
        this.movieRepo=movieRepo;
        this.photosRepo=photosRepo;
        this.userMapper=userMapper;
        this.photosMapper=photosMapper;

    }
    @EventListener(ApplicationReadyEvent.class)
    public  void runExample() {
        UserEntity user = new UserEntity("admin","admin","admin","admin","adrian07071996@gmail.com",true);
        //userRepo.save(user);
        user = new UserEntity("admin2","admin2","admin2","admin2","adrian07071996@gmail.com",true);
       // userRepo.save(user);
        user = new UserEntity("user","user","user","user","adrian07071996@gmail.com",false);
       // userRepo.save(user);


        }
    }


