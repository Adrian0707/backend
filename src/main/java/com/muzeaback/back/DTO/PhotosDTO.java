package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.EventEntity;

public class PhotosDTO {
    private Long idphotos;

    public Long getIdphotos() {
        return idphotos;
    }

    public void setIdphotos(Long idphotos) {
        this.idphotos = idphotos;
    }

    private String path;
    private Long eventByIdevent;

    public PhotosDTO(String path, Long eventByIdevent) {
        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    public Long getEventByIdevent() {
        return eventByIdevent;
    }

    public PhotosDTO(Long idphotos, String path, Long eventByIdevent) {
        this.idphotos = idphotos;
        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    public void setEventByIdevent(Long eventByIdevent) {
        this.eventByIdevent = eventByIdevent;
    }

    @Override
    public String toString() {
        return "PhotosDTO{" +
                "path='" + path + '\'' +
                ", eventByIdevent=" + eventByIdevent +
                '}';
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PhotosDTO(String path) {
        this.path = path;
    }

    public PhotosDTO() {
    }

}
