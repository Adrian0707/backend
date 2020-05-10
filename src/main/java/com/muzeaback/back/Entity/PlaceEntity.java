package com.muzeaback.back.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "place", schema = "muzea", catalog = "")
public class PlaceEntity {
    private Long idPlace;
    private String adres;
    private String name;
    private String tel;
    private String email;
    private Long userByIduser;

    @Override
    public String toString() {
        return "PlaceEntity{" +
                "idPlace=" + idPlace +
                ", adres='" + adres + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", userByIduser=" + userByIduser +
                '}';
    }

    public PlaceEntity(String adres, String name, String tel, String email, Long userByIduser) {

        this.adres = adres;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.userByIduser = userByIduser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlace", nullable = false)
    public Long getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(Long idPlace) {
        this.idPlace = idPlace;
    }

    @Basic
    @Column(name = "Adres", nullable = true, length = 45)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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
    @Column(name = "tel", nullable = true, length = 45)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceEntity that = (PlaceEntity) o;
        return idPlace == that.idPlace &&
                Objects.equals(adres, that.adres) &&
                Objects.equals(name, that.name) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlace, adres, name, tel, email);
    }


    public Long getUserByIduser() {
        return userByIduser;
    }



    public void setUserByIduser(Long userByIduser) {
        this.userByIduser = userByIduser;
    }
    public PlaceEntity() {
    }
}
