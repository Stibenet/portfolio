package ru.ugrasu.portfolio.models.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Марсель on 14.10.2017.
 */
@Entity
@Table(name = "workplace", schema = "portfoliodb", catalog = "")
public class WorkplaceEntity {
    private int idWorkplace;
    private String name;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkplaceEntity that = (WorkplaceEntity) o;
        return idWorkplace == that.idWorkplace &&
                Objects.equals(name, that.name) &&
                Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWorkplace, name, place);
    }

    private String place;

    @Id
    @Column(name = "id_workplace", nullable = false)
    public int getIdWorkplace() {
        return idWorkplace;
    }

    public void setIdWorkplace(int idWorkplace) {
        this.idWorkplace = idWorkplace;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
