package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Tranrq003 {
	@JsonProperty("ISBN")
    private String isbn;
	
	@JsonProperty("NAME")
    private String name;
	
	@JsonProperty("AUTHOR")
    private String author;
	
	@JsonProperty("INTRODUCTION")
    private String introduction;
	
	@JsonProperty("PAGE")
	private Tranrq003TranrqPage page;
}
