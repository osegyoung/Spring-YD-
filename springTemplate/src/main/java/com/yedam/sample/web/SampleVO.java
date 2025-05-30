package com.yedam.sample.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
//@JsonIgnoreProperties({"password","lastName"})
public class SampleVO {
	private Integer mno;
	//@JsonProperty("name")
	private String firstName;
	private String lastName;
	//@JsonIgnore
	//private String password;
	
}
