package com.yhq.mysql.pojo;

import java.io.Serializable;
import java.util.Date;

public class EntryGrade  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8252601611209859940L;

	private Long id;

    private Long entryPeopleId;

    private String screeningNo;

    private String status;

    private Integer elapsedTime;

    private Integer wrongTopicCount;

    private Integer totalTime;

    private Date doneTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntryPeopleId() {
        return entryPeopleId;
    }

    public void setEntryPeopleId(Long entryPeopleId) {
        this.entryPeopleId = entryPeopleId;
    }

    public String getScreeningNo() {
        return screeningNo;
    }

    public void setScreeningNo(String screeningNo) {
        this.screeningNo = screeningNo == null ? null : screeningNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getWrongTopicCount() {
        return wrongTopicCount;
    }

    public void setWrongTopicCount(Integer wrongTopicCount) {
        this.wrongTopicCount = wrongTopicCount;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Date getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(Date doneTime) {
        this.doneTime = doneTime;
    }
}