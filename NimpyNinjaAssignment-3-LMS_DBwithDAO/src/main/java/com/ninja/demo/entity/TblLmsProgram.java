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
	
	@Column(name="program_name", unique = true, nullable = false)
	private String programName;
	
	@Column(name="program_description", nullable = true)
	private String programDescription;
	
	@Column(name="program_status", nullable = false)
	private String programStatus;
	
	@Column(name="creation_time", nullable = false)
	private LocalDateTime creationTime;
	
	@Column(name="last_mod_time", nullable = false)
	private LocalDateTime lastModTime;
	
	
}
