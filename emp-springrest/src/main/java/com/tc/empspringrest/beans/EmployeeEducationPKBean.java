package com.tc.empspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;


@SuppressWarnings("serial")
@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationPKBean implements Serializable{

	@XmlTransient
	@JoinColumn(name = "id")
	@ManyToOne
	private EmployeeInfoBean infoBean;
	@Column(name = "educational_type")
	private String educationalType;
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getEducationalType() {
		return educationalType;
	}
	public void setEducationalType(String educationalType) {
		this.educationalType = educationalType;
	}
	
	
	
}
