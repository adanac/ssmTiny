package test.domain;

import java.util.Date;

public class Task {
    private Long sysNo;

    private String taskNo;

    private String taskName;

    private Integer taskStatus;

    private Integer taskType;

    private String taskOwner;

    private String taskDesc;

    private Integer yn;

    private Date ts;

    private Date createTime;

    private String createPin;

    private String updatePin;

    public Long getSysNo() {
        return sysNo;
    }

    public void setSysNo(Long sysNo) {
        this.sysNo = sysNo;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(String taskOwner) {
        this.taskOwner = taskOwner == null ? null : taskOwner.trim();
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc == null ? null : taskDesc.trim();
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePin() {
        return createPin;
    }

    public void setCreatePin(String createPin) {
        this.createPin = createPin == null ? null : createPin.trim();
    }

    public String getUpdatePin() {
        return updatePin;
    }

    public void setUpdatePin(String updatePin) {
        this.updatePin = updatePin == null ? null : updatePin.trim();
    }
}