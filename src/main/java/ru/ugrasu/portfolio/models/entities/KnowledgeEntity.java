package ru.ugrasu.portfolio.models.entities;

import javax.persistence.Entity;
import java.util.Objects;

/**
 * Created by Марсель on 14.10.2017.
 */
@Entity
@javax.persistence.Table(name = "knowledge", schema = "portfoliodb", catalog = "")
public class KnowledgeEntity {
    private int idKnowledge;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_knowledge", nullable = false)
    public int getIdKnowledge() {
        return idKnowledge;
    }

    public void setIdKnowledge(int idKnowledge) {
        this.idKnowledge = idKnowledge;
    }

    private String nameKnowledge;

    public String getPeriodStudy() {
        return periodStudy;
    }

    public void setPeriodStudy(String periodStudy) {
        this.periodStudy = periodStudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnowledgeEntity that = (KnowledgeEntity) o;
        return idKnowledge == that.idKnowledge &&
                Objects.equals(nameKnowledge, that.nameKnowledge) &&
                Objects.equals(periodStudy, that.periodStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKnowledge, nameKnowledge, periodStudy);
    }

    private String periodStudy;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name_knowledge", nullable = false, length = 255)
    public String getNameKnowledge() {
        return nameKnowledge;
    }

    public void setNameKnowledge(String nameKnowledge) {
        this.nameKnowledge = nameKnowledge;
    }

}
