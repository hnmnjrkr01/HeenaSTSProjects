package com.ninja.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="tbl_lms_program")
public class TblLmsProgram implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="program_id")
	Integer programId;
	
	@Column(name="program_name")
	 String programName;
	
	@Column(name="program_description")
	 String programDescription;
	
	@Column(name="program_status")
	 String programStatus;
	
	@Column(name="creation_time")
	 LocalDateTime creationTime;
	
	@Column(name="last_mod_time")
	 LocalDateTime lastModTime;

	public Integer getProgramId() {
		return programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramDescription() {
		return programDescription;
	}

	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}

	public String getProgramStatus() {
		return programStatus;
	}

	public void setProgramStatus(String programStatus) {
		this.programStatus = programStatus;
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
		return "TblLmsProgram [programId=" + programId + ", programName=" + programName + ", programDescription="
				+ programDescription + ", programStatus=" + programStatus + ", creationTime=" + creationTime
				+ ", lastModTime=" + lastModTime + "]";
	}
	
	
	
}
