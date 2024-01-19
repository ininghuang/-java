package com.example.library.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIBRARY_BOOK")

public class LibraryBookEntity implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "Name")
	private String name;

	@Column(name = "Author")
	private String author;
	
	@Column(name = "Introduction")
	private String introduction;
	
	
	
}
