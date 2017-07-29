package com.adanac.ssm.intf.common.domain.bean;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -4130950187647500263L;
	private Integer studentId;
	private String studentName;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName == null ? null : studentName.trim();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
