package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.PlaceDTO;
import com.muzeaback.back.DTO.PlaceMapper;
import com.muzeaback.back.Entity.PlaceEntity;
import com.muzeaback.back.Entity.UserEntity;
import com.muzeaback.back.Repository.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceService {

    private PlaceRepo placeRepo;
    private PlaceMapper placeMapper;
    @Autowired
    public PlaceService(PlaceRepo placeRepo, PlaceMapper placeMapper) {
        this.placeRepo = placeRepo;
        this.placeMapper = placeMapper;
    }

    public List<PlaceDTO> getAllByUserByIduser(Long id){
        return placeMapper.toDto(placeRepo.findAllByUserByIduser(id));
    }
    public PlaceDTO getByIdPlace(Long id){
        return placeMapper.toDto(placeRepo.findByIdPlace(id));
    }
    public void postPlacePlaceEntity(PlaceDTO placeDTO){
        placeRepo.save(placeMapper.toEntity(placeDTO));
    }
    public List<PlaceDTO> getAll (){
        return placeMapper.toDto(placeRepo.findAll());
    }

}
