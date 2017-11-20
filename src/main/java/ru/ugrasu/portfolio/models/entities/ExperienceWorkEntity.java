package ru.ugrasu.portfolio.models.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Марсель on 20.11.2017.
 */
@Entity
@Table(name = "experience_work", schema = "portfoliodb", catalog = "")
public class ExperienceWorkEntity {
    private int id;
    private String company;
    private String city;
    private String termWork;
    private String jobVacancy;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "company", nullable = false, length = 50)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 255)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "term_work", nullable = false, length = 255)
    public String getTermWork() {
        return termWork;
    }

    public void setTermWork(String termWork) {
        this.termWork = termWork;
    }

    @Basic
    @Column(name = "job_vacancy", nullable = false, length = 255)
    public String getJobVacancy() {
        return jobVacancy;
    }

    public void setJobVacancy(String jobVacancy) {
        this.jobVacancy = jobVacancy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperienceWorkEntity that = (ExperienceWorkEntity) o;
        return id == that.id &&
                Objects.equals(company, that.company) &&
                Objects.equals(city, that.city) &&
                Objects.equals(termWork, that.termWork) &&
                Objects.equals(jobVacancy, that.jobVacancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, city, termWork, jobVacancy);
    }
}
