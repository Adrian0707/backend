package com.muzeaback.back.DTO;

import com.muzeaback.back.Entity.EventEntity;
import com.muzeaback.back.Entity.PlaceEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class EventDTO {
    private Long idEvent;
    private String name;
    private Date dateStart;
    private Date dateEnd;
    private String description;
    private Long placeByIdplace;

    public EventDTO(Long idEvent, String name, Date dateStart, Date dateEnd, String description, Long placeByIdplace) {
        this.idEvent = idEvent;
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.description = description;
        this.placeByIdplace = placeByIdplace;
    }

    public EventDTO(String name, Date dateStart, Date dateEnd, String description, Long placeByIdplace) {
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.description = description;
        this.placeByIdplace = placeByIdplace;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }
    @Override
    public String toString() {
        return "EventDTO{" +
                "idEvent=" + idEvent +
                ", name='" + name + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", description='" + description + '\'' +
                ", placeByIdplace=" + placeByIdplace +
                '}';
    }
    public Long getPlaceByIdplace() {
        return placeByIdplace;
    }

    public void setPlaceByIdplace(Long placeByIdplace) {
        this.placeByIdplace = placeByIdplace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public EventDTO() {
    }


}
