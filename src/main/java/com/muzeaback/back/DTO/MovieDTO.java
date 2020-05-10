package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.EventEntity;

public class MovieDTO {
    private Long idmovie;

    public MovieDTO(Long idmovie, String path, Long eventByIdevent) {
        this.idmovie = idmovie;
        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "idmovie=" + idmovie +
                ", path='" + path + '\'' +
                ", eventByIdevent=" + eventByIdevent +
                '}';
    }

    private String path;
    private Long eventByIdevent;
    public Long getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Long idmovie) {
        this.idmovie = idmovie;
    }
    public MovieDTO(String path, Long eventByIdevent) {
        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    public Long getEventByIdevent() {
        return eventByIdevent;
    }

    public void setEventByIdevent(Long eventByIdevent) {
        this.eventByIdevent = eventByIdevent;
    }

    public String getPath() {
        return path;
    }

    public MovieDTO() {
    }

    public MovieDTO(String path) {
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
