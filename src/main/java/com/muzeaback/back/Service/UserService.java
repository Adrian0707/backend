package com.muzeaback.back.Service;

import com.muzeaback.back.DTO.UserDTO;
import com.muzeaback.back.DTO.UserMapper;
import com.muzeaback.back.Entity.UserEntity;
import com.muzeaback.back.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo  userRepo;
    private UserMapper userMapper;
    @Autowired
    public UserService(UserRepo userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
    }

    public UserDTO getByLoginAndPass(String Login, String Pass){
        return userMapper.toDto(userRepo.findByLoginAndPass(Login,Pass));
    }
    public UserDTO getByIdUser(Long id){
        return userMapper.toDto(userRepo.findByIdUser(id));
    }

    public void postUser( UserDTO userDTO){
        //UserDTO userDTO = new UserDTO(  login,  pass,  fName,  lName,  email,  admin);
        userRepo.save(userMapper.toEntity(userDTO));
    }
    public boolean  loginAvailable(String Login){
        return !userRepo.existsUserEntityByLogin(Login);
    }
}
