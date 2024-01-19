package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Tranrq003TranrqPage {

	@JsonProperty("PAGENUMBER")
	private Number pageNumber;
	
	@JsonProperty("PAGESIZE")
	private Number pageSize;

	
}
