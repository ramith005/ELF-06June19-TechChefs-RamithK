package com.tc.empspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Table(name = "employee_otherinfo")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable{
	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name = "id" )
	
	private EmployeeInfoBean infoBean;
	
	@Column(name = "pan")
	private String pan;
	
	@XmlElement(name = "is-married")
	@Column(name = "ismarried")
	private boolean isMarried;
	
	@Column(name = "blood_grp")
	private String bloodGrp;
	
	@Column(name = "ischallenged")
	private boolean isChallenged;
	
	@Column(name = "emergency_contact_number")
	private long emergencyCN;
	
	@Column(name = "emergency_contact_person")
	private String emergencyCP;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "religion")
	private String religion;
	
	@Column(name = "father_nm")
	private String fatherNM;
	
	@Column(name = "mother_nm")
	private String motherNM;
	
	@Column(name = "spouse_nm")
	private String spouseNM;
	
	@Column(name = "passport")
	private String passport;
	
	@Column(name = "adhar")
	private long adhar;
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public boolean isChallenged() {
		return isChallenged;
	}
	public void setChallenged(boolean isChallenged) {
		this.isChallenged = isChallenged;
	}
	public long getEmergencyCN() {
		return emergencyCN;
	}
	public void setEmergencyCN(long emergencyCN) {
		this.emergencyCN = emergencyCN;
	}
	public String getEmergencyCP() {
		return emergencyCP;
	}
	public void setEmergencyCP(String emergencyCP) {
		this.emergencyCP = emergencyCP;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getFatherNM() {
		return fatherNM;
	}
	public void setFatherNM(String fatherNM) {
		this.fatherNM = fatherNM;
	}
	public String getMotherNM() {
		return motherNM;
	}
	public void setMotherNM(String motherNM) {
		this.motherNM = motherNM;
	}
	public String getSpouseNM() {
		return spouseNM;
	}
	public void setSpouseNM(String spouseNM) {
		this.spouseNM = spouseNM;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
}
