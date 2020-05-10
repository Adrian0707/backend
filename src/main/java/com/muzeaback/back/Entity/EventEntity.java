package com.muzeaback.back.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "event", schema = "muzea", catalog = "")
public class EventEntity {
    private Long idEvent;
    private String name;
    private Date dateStart;
    private Date dateEnd;
    private String description;
    private Long placeByIdplace;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvent", nullable = false)
    public Long getIdEvent() {
        return idEvent;
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "idEvent=" + idEvent +
                ", name='" + name + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", description='" + description + '\'' +
                ", placeByIdplace=" + placeByIdplace +
                '}';
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Date_start", nullable = true)
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "Date_end", nullable = true)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return idEvent == that.idEvent &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(dateEnd, that.dateEnd) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvent, name, dateStart, dateEnd, description);
    }

    public EventEntity() {
    }

    public EventEntity(String name, Date dateStart, Date dateEnd, String description, Long placeByIdplace) {

        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.description = description;
        this.placeByIdplace = placeByIdplace;
    }



    public Long getPlaceByIdplace() {
        return placeByIdplace;
    }

    public void setPlaceByIdplace(Long placeByIdplace) {
        this.placeByIdplace = placeByIdplace;
    }
}
