package com.lessons.multilang.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "responseTemplates")
public class ResponseTemplatesEntity {
    private int responseId;
    private int serviceId;
    private int languageId;
    private String responseMessage;
    private int channelId;
    private int statusCodeId;
    private byte active;
    private Timestamp dateCreated;
    private Timestamp dateModified;



    @Id
    @Column(name = "responseID")
    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    @Basic
    @Column(name = "serviceID")
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "languageID")
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "responseMessage")
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Basic
    @Column(name = "channelID")
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "statusCodeID")
    public int getStatusCodeId() {
        return statusCodeId;
    }

    public void setStatusCodeId(int statusCodeId) {
        this.statusCodeId = statusCodeId;
    }

    @Basic
    @Column(name = "active")
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
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
        ResponseTemplatesEntity that = (ResponseTemplatesEntity) o;
        return responseId == that.responseId &&
                serviceId == that.serviceId &&
                languageId == that.languageId &&
                channelId == that.channelId &&
                active == that.active &&
                Objects.equals(responseMessage, that.responseMessage) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(dateModified, that.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseId, serviceId, languageId, responseMessage, channelId, active, dateCreated, dateModified);
    }
}
