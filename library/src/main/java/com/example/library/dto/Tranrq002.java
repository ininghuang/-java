package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tranrq002 {
	@JsonProperty("USER_ID")
	private String userId;

	@JsonProperty("PHONE_NUMBER")
	private String phoneNumber;

	@JsonProperty("PASSWORD")
	private String password;

	@JsonProperty("USER_NAME")
	private String userName;

	@JsonProperty("REGISTRATION_TIME ")
	private String registrationTime;

	@JsonProperty("Last_Login_Time")
	private String lastLoginTime;

}
