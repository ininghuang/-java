package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Tranrs001 {

	@JsonProperty("USER_ID")
    private String userId;
	
	@JsonProperty("PASSWORD")
    private String password;
	
	@JsonProperty("PHONE_NUMBER")
    private String phoneNumber;
	
	@JsonProperty("USER_NAME")
    private String userName;
	
	@JsonProperty("REGISTARTION_TIME")
    private String registartionTime;
	
	@JsonProperty("LAST_LOGIN_TIME")
    private String lastLoginTime;
}
