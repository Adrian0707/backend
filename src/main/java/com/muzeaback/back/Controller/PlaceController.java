package com.muzeaback.back.Controller;

import com.muzeaback.back.DTO.PlaceDTO;
import com.muzeaback.back.Service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/place")
public class PlaceController {
    private PlaceService placeService;
    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("")
    List<PlaceDTO> getAll(){
        return placeService.getAll();
    }
    @GetMapping("/user/{id}")
    List<PlaceDTO> getAllPlacesByUserId(@PathVariable("id")Long id){
        return placeService.getAllByUserByIduser(id);
    }
    @GetMapping("/{id}")
    PlaceDTO getPlaceById(@PathVariable("id") Long id){
        return placeService.getByIdPlace(id);
    }
    @PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    void postPlace(@RequestBody PlaceDTO placeDTO){
        placeService.postPlacePlaceEntity(placeDTO);
    }


}
