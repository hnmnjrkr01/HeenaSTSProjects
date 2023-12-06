package com.ninja.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

@Entity
@Table(name="tbl_lms_batch")
public class TblLmsBatch implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="batch_id")
	Integer batchID;
	
	
	@ManyToOne //(cascade = CascadeType.PERSIST )
	@JoinColumn(name="batch_program_id")
	private TblLmsProgram lmsProgram;	

	
	@Column(name="batch_name")
	 private String batchName;
	
	@Column(name="batch_description")
	private String batchDescription;
	
	@Column(name="batch_status")
	private String batchStatus;
	
	@Column(name="batch_no_of_classes")
	private int batchNoOfClasses;
	
	@Column(name="creation_time")
	private LocalDateTime creationTime;	

	@Column(name="last_mod_time")
	private LocalDateTime lastModTime;
	
	
	
	
	public Integer getBatchID() {
		return batchID;
	}

	public void setBatchID(Integer batchID) {
		this.batchID = batchID;
	}

	public TblLmsProgram getLmsProgram() {
		return lmsProgram;
	}

	public void setLmsProgram(TblLmsProgram lmsProgram) {
		this.lmsProgram = lmsProgram;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchDescription() {
		return batchDescription;
	}

	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public int getBatchNoOfClasses() {
		return batchNoOfClasses;
	}

	public void setBatchNoOfClasses(int batchNoOfClasses) {
		this.batchNoOfClasses = batchNoOfClasses;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public LocalDateTime getLastModTime() {
		return lastModTime;
	}

	public void setLastModTime(LocalDateTime lastModTime) {
		this.lastModTime = lastModTime;
	}

	@Override
	public String toString() {
		return "TblLmsBatch [batchID=" + batchID + ", lmsProgram=" + lmsProgram + ", batchName=" + batchName
				+ ", batchDescription=" + batchDescription + ", batchStatus=" + batchStatus + ", batchNoOfClasses="
				+ batchNoOfClasses + ", creationTime=" + creationTime + ", lastModTime=" + lastModTime + "]";
	}


}
