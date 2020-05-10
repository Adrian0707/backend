package com.muzeaback.back.Controller;

import com.muzeaback.back.DTO.PhotosDTO;
import com.muzeaback.back.Service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/photos")
public class PhotosController {
    private PhotosService photosService;
@Autowired
    public PhotosController(PhotosService photosService) {
        this.photosService = photosService;
    }
    @GetMapping("/event/{id}")
    List<PhotosDTO> getPhotosByEventId(@PathVariable("id") Long id){
    return photosService.getAllByEventByIdevent(id);
    }
    @GetMapping("/{id}")
    PhotosDTO getPhotoById(@PathVariable("id") Long id){
    return photosService.getByIdphotos(id);
    }
    @PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    void postPhoto(@RequestBody PhotosDTO photosDTO){
    photosService.postPhotos(photosDTO);
    }

}
