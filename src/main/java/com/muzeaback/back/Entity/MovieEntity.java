package com.muzeaback.back.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie", schema = "muzea", catalog = "")
public class MovieEntity {
    private Long idmovie;
    private String path;
    private Long eventByIdevent;

    @Override
    public String toString() {
        return "MovieEntity{" +
                "idmovie=" + idmovie +
                ", path='" + path + '\'' +
                ", eventByIdevent=" + eventByIdevent +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovie", nullable = false)
    public Long getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Long idmovie) {
        this.idmovie = idmovie;
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
        MovieEntity that = (MovieEntity) o;
        return idmovie == that.idmovie &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmovie, path);
    }



    public Long getEventByIdevent() {
        return eventByIdevent;
    }



    public void setEventByIdevent(Long eventByIdeventr) {
        this.eventByIdevent = eventByIdeventr;
    }

    public MovieEntity( String path, Long eventByIdevent) {

        this.path = path;
        this.eventByIdevent = eventByIdevent;
    }

    public MovieEntity() {
    }
}
