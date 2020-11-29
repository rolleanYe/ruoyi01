package com.ruoyi.system.domain;

import java.util.Date;

public class PfItemUser {
    private Long id;

    private Integer itemScore;

    private String itemEvaluation;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemScore() {
        return itemScore;
    }

    public void setItemScore(Integer itemScore) {
        this.itemScore = itemScore;
    }

    public String getItemEvaluation() {
        return itemEvaluation;
    }

    public void setItemEvaluation(String itemEvaluation) {
        this.itemEvaluation = itemEvaluation == null ? null : itemEvaluation.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}