package com.lessons.multilang.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "statusCodes")
public class StatusCodesEntity {
    private int statusCodeId;
    private String description;
    private String scenario;
    private int statusCode;
    private Integer active;
    private Timestamp dateCreated;
    private Timestamp dateModified;

    @Id
    @Column(name = "statusCodeID")
    public int getStatusCodeId() {
        return statusCodeId;
    }

    public void setStatusCodeId(int statusCodeId) {
        this.statusCodeId = statusCodeId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "scenario")
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    @Basic
    @Column(name = "statusCode")
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Basic
    @Column(name = "active")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Basic
    @Column(name = "dateCreated")
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Basic
    @Column(name = "dateModified")
    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusCodesEntity that = (StatusCodesEntity) o;
        return statusCodeId == that.statusCodeId &&
                statusCode == that.statusCode &&
                Objects.equals(description, that.description) &&
                Objects.equals(scenario, that.scenario) &&
                Objects.equals(active, that.active) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(dateModified, that.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCodeId, description, scenario, statusCode, active, dateCreated, dateModified);
    }
}
