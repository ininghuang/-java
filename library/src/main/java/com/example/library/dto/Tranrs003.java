package com.example.library.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Tranrs003 {

	@JsonProperty("RESPONSE")
	private String response;

	@JsonProperty("TOTALPAGE")
	private Integer totalPage;

	@JsonProperty("TOTALCOUNT")
	private Integer totalCount;

	@JsonProperty("PAGENUMBER")
	private Integer pageNumber;

	@JsonProperty("PAGESIZE")
	private Integer pageSize;

	@JsonProperty("ITEMS")
	private List<LibraryBookQALLTranrsItems> items;

}
