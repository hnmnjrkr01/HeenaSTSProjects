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



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name="tbl_lms_program")
public class TblLmsProgram {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="program_id")
	private Integer programId;
	
	@Column(name="program_name")
	private String programName;
	
	@Column(name="program_description")
	private String programDescription;
	
	@Column(name="program_status")
	private String programStatus;
	
	@Column(name="creation_time")
	private LocalDateTime creationTime;
	
	@Column(name="last_mod_time")
	private LocalDateTime lastModTime;
	
	
}
