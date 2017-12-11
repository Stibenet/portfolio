package ru.ugrasu.portfolio.models.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Марсель on 11.12.2017.
 */
@Entity
@Table(name = "auth", schema = "portfoliodb", catalog = "")
public class AuthEntity {
    private int id;
    private String login;
    private String pass;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 255)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pass", nullable = false, length = 255)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthEntity that = (AuthEntity) o;
        return id == that.id &&
                Objects.equals(login, that.login) &&
                Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, pass);
    }
}
