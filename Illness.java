package com.upc.model;

public class Illness {
    private Integer illnessId;

    private String illnessName;
    
    private String describes;

    public Integer getIllnessId() {
        return illnessId;
    }

    public void setIllnessId(Integer illnessId) {
        this.illnessId = illnessId;
    }

    public String getIllnessName() {
        return illnessName;
    }
    
    public void setDescribe(String describes) {
        this.describes = describes;
    }

    public String getDescribe() {
        return describes;
    }

    

    public void setIllnessName(String illnessName) {
        this.illnessName = illnessName == null ? null : illnessName.trim();
    }
}