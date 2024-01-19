package com.example.library.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIBRARY_INVENTORY")

public class LibraryInventoryEntity implements Serializable  {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "INVENTORY_ID")
	private String inventoryId;
	
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "STORE_TIME")
	private String storeTime;
	
	@Column(name = "STATUS")
	private String status;
	
	
	
	
	
}
