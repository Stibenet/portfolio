package ru.ugrasu.portfolio.models.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Марсель on 16.11.2017.
 */
@Entity
@Table(name = "about_me", schema = "portfoliodb", catalog = "")
public class AboutMeEntity {
    private String description;
    private int idAbout;

    @Basic
    @Column(name = "description", nullable = false, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @Column(name = "id_about", nullable = false)
    public int getIdAbout() {
        return idAbout;
    }

    public void setIdAbout(int idAbout) {
        this.idAbout = idAbout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AboutMeEntity that = (AboutMeEntity) o;
        return idAbout == that.idAbout &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, idAbout);
    }
}
