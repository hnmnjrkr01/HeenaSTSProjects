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




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name="tbl_lms_batch")
public class TblLmsBatch implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="batch_id")
	private Integer batchID;
	
	
	@ManyToOne //(cascade = CascadeType.PERSIST )
	@JoinColumn(name="batch_program_id")
	private TblLmsProgram lmsProgram;	

	
	@Column(name="batch_name", unique = true, nullable = false)
	private String batchName;
	
	@Column(name="batch_description", nullable = true)
	private String batchDescription;
	
	@Column(name="batch_status", nullable = false)
	private String batchStatus;
	
	@Column(name="batch_no_of_classes", nullable = false)
	private int batchNoOfClasses;
	
	@Column(name="creation_time", nullable = false)
	private LocalDateTime creationTime;	

	@Column(name="last_mod_time", nullable = false)
	private LocalDateTime lastModTime;
	

}
