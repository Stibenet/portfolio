package ru.ugrasu.portfolio.models.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Марсель on 14.10.2017.
 */
@Entity
@Table(name = "user", schema = "portfoliodb", catalog = "")
public class UserEntity {
    private int id;
    private String fname;
    private String name;
    private String lname;
    private String infoUser;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fname", nullable = false, length = 255)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lname", nullable = false, length = 255)
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "infoUser", nullable = false, length = 255)
    public String getInfoUser() {
        return infoUser;
    }

    public void setInfoUser(String infoUser) {
        this.infoUser = infoUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(fname, that.fname) &&
                Objects.equals(name, that.name) &&
                Objects.equals(lname, that.lname) &&
                Objects.equals(infoUser, that.infoUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, name, lname, infoUser);
    }
}
