package com.example.library.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIBRARY_BORROWING_RECORD")
public class LibraryBorrowingRecordEntity  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "INVENTORY_ID")
	private String inventoryId;
	
	@Column(name = "BORROWING_TIME")
	private String borrowingTime;
	
	@Column(name = "RETURN_TIME")
	private String returnTime;
	
	

}
