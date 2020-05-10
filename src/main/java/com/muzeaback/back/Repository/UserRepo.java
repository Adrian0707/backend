package com.muzeaback.back.Repository;

import com.muzeaback.back.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {
    //UserEntity findByLoginAndPass(String Login,String Pass);
    UserEntity findByLoginAndPass(String Login,String Pass);
    UserEntity findByIdUser(Long id);
    boolean existsUserEntityByLogin(String Login);
}
