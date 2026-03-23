package com.gal.mockito_training.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Training {
    @Id
    @GeneratedValue
    private int trainingid;

    private Date startDate, endDate;
    private String topic;
    private String trainername;

    public Training(int trainingid, Date startDate, Date endDate, String topic, String trainername) {
        this.trainingid = trainingid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.topic = topic;
        this.trainername = trainername;
    }

    public Training(){
        super();
    }

    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(int trainingid) {
        this.trainingid = trainingid;
    }


}
