package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.PhotosDTO;
import com.muzeaback.back.DTO.PhotosMapper;
import com.muzeaback.back.Entity.EventEntity;
import com.muzeaback.back.Entity.PhotosEntity;
import com.muzeaback.back.Repository.PhotosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhotosService {

    private PhotosRepo photosRepo;
    private PhotosMapper photosMapper;
    @Autowired
    public PhotosService(PhotosRepo photosRepo, PhotosMapper photosMapper) {
        this.photosRepo = photosRepo;
        this.photosMapper = photosMapper;
    }

    public List<PhotosDTO> getAllByEventByIdevent(Long id){
        return photosMapper.toDto(photosRepo.findAllByEventByIdevent(id));
    }
    public PhotosDTO getByIdphotos(Long id){
        return photosMapper.toDto(photosRepo.findByIdphotos(id));
    }

    public void postPhotos( PhotosDTO photosDTO){
        //PhotosDTO photosDTO = new PhotosDTO(  path,  eventByIdevent);
        photosRepo.save(photosMapper.toEntity(photosDTO));

    }
}
