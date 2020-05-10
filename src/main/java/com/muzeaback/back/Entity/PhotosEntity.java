package com.muzeaback.back.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "photos", schema = "muzea", catalog = "")
public class PhotosEntity {
    private Long idphotos;
    private String path;
    private Long eventByIdevent;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idphotos", nullable = false)
    public Long getIdphotos() {
        return idphotos;
    }

    public void setIdphotos(Long idphotos) {
        this.idphotos = idphotos;
    }

    @Override
    public String toString() {
        return "PhotosEntity{" +
                "idphotos=" + idphotos +
                ", path='" + path + '\'' +
                ", eventByIdevent=" + eventByIdevent +
                '}';
    }

    @Basic
    @Column(name = "path", nullable = true, length = 45)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosEntity that = (PhotosEntity) o;
        return idphotos == that.idphotos &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idphotos, path);
    }



    public Long getEventByIdevent() {
        return eventByIdevent;
    }



    public void setEventByIdevent(Long eventByIdeventr) {
        this.eventByIdevent = eventByIdeventr;
    }

    public PhotosEntity( String path, Long eventByIdevent) {

        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    public PhotosEntity() {
    }
}
