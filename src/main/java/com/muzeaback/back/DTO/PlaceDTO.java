package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.UserEntity;

public class PlaceDTO {
    private Long idPlace;

    public Long getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(Long idPlace) {
        this.idPlace = idPlace;
    }

    private String adres;
    private String name;
    private String tel;

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "idPlace=" + idPlace +
                ", adres='" + adres + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", userByIduser=" + userByIduser +
                '}';
    }

    private String email;
    private Long userByIduser;

    public PlaceDTO(String adres, String name, String tel, String email, Long userByIduser) {
        this.adres = adres;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.userByIduser = userByIduser;
    }

    public Long getUserByIduser() {
        return userByIduser;
    }

    public void setUserByIduser(Long userByIduser) {
        this.userByIduser = userByIduser;
    }

    public String getAdres() {
        return adres;
    }

    public PlaceDTO(String adres, String name, String tel, String email) {
        this.adres = adres;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public PlaceDTO() {
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
