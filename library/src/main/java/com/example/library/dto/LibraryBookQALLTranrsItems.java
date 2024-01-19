package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LibraryBookQALLTranrsItems {
	
	
	@JsonProperty("ISBN")
    private Integer isbn;

	@JsonProperty("NAME")
    private String name;
	
	@JsonProperty("AUTHOR")
    private String author;
	
	@JsonProperty("INTRODUCTION")
    private String introduction;
	
}
