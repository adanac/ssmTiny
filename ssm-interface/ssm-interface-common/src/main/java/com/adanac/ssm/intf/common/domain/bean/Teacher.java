package com.adanac.ssm.intf.common.domain.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6200397750441427365L;

	private Integer teacherId;

	private String teacherName;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName == null ? null : teacherName.trim();
	}
}