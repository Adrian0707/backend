package com.muzeaback.back.Controller;

import com.muzeaback.back.DTO.UserDTO;
import com.muzeaback.back.DTO.UserMapper;
import com.muzeaback.back.Entity.UserEntity;
import com.muzeaback.back.Repository.UserRepo;
import com.muzeaback.back.Service.UserService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }




    @GetMapping("/{login}/{haslo}")
    public UserDTO getHelloMessage(@PathVariable("login") String login, @PathVariable("haslo") String haslo){
        return userService.getByLoginAndPass(login, haslo);
    }
    @GetMapping("/id/{id}")
    public UserDTO getUser(@PathVariable("id") Long id) {
        return userService.getByIdUser(id);
    }
    @GetMapping("/check/{login}")
    public Boolean checkLoginAvailable(@PathVariable("login")String login){
        return userService.loginAvailable(login);
        }

        @PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postUser(@RequestBody UserDTO userDTO){
        userService.postUser(userDTO);

    }
    }



