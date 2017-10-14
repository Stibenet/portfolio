package ru.ugrasu.portfolio.models.entities;


import javax.persistence.*;

/**
 * Created by Марсель on 05.10.2017.
 */
@Entity
@Table(name = "mywork", schema = "portfoliodb")
public class MyWorkEntity {

    private int idWork;
    private String nameWork;
    private String descriptionWork;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_work")
    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    @Basic
    @Column(name = "name_work")
    public String getNameWork() {
        return nameWork;
    }
    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    @Basic
    @Column(name = "description_work")
    public String getDescriptionWork() {
        return descriptionWork;
    }

    public void setDescriptionWork(String descriptionWork) {
        this.descriptionWork = descriptionWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyWorkEntity that = (MyWorkEntity) o;

        if (idWork != that.idWork) return false;
        if (nameWork != null ? !nameWork.equals(that.nameWork) : that.nameWork != null) return false;
        if (descriptionWork != null ? !descriptionWork.equals(that.descriptionWork) : that.descriptionWork != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWork;
        result = 31 * result + (nameWork != null ? nameWork.hashCode() : 0);
        result = 31 * result + (descriptionWork != null ? descriptionWork.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyWorkEntity{" +
                "idWork=" + idWork +
                ", nameWork='" + nameWork + '\'' +
                ", descriptionWork='" + descriptionWork + '\'' +
                '}';
    }
}
