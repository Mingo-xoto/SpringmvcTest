package com.yhq.mysql.pojo;

public class ScreeningInfo {
    private Long id;

    private String screeningNo;

    private String screeningName;

    private String gameType;

    private Integer eliminateTime;

    private Integer wrongTopicParameter;

    private String area;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScreeningNo() {
        return screeningNo;
    }

    public void setScreeningNo(String screeningNo) {
        this.screeningNo = screeningNo == null ? null : screeningNo.trim();
    }

    public String getScreeningName() {
        return screeningName;
    }

    public void setScreeningName(String screeningName) {
        this.screeningName = screeningName == null ? null : screeningName.trim();
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public Integer getEliminateTime() {
        return eliminateTime;
    }

    public void setEliminateTime(Integer eliminateTime) {
        this.eliminateTime = eliminateTime;
    }

    public Integer getWrongTopicParameter() {
        return wrongTopicParameter;
    }

    public void setWrongTopicParameter(Integer wrongTopicParameter) {
        this.wrongTopicParameter = wrongTopicParameter;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}