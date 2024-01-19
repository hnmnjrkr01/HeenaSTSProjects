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
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
	@NotNull(message = "lmsProgram Id can't be NULL")
	private TblLmsProgram lmsProgram;	

	
	@Column(name="batch_name", unique = true)
	@NotNull(message = "Batch Name can't be NULL")
	private String batchName;
	
	@Column(name="batch_description")
	private String batchDescription;
	
	@Column(name="batch_status")
	@NotNull(message = "Batch Status can't be NULL")
	private String batchStatus;
	
	@Column(name="batch_no_of_classes")
	@Min(1)
	private int batchNoOfClasses;
	
	@Column(name="creation_time")
	@NotNull(message = "Creation Time can't be NULL")
	private LocalDateTime creationTime;	

	@Column(name="last_mod_time", nullable = false)
	@NotNull(message = "Last Modification Time can't be NULL")
	private LocalDateTime lastModTime;
	

}
