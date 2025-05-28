package com.yedam.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeesDepartmentVO {
	private String employeeId;
	private String firstName;
	@DateTimeFormat(pattern= "yyyy-MM-dd hh:mm") // 시간까지 같이 설정
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm") // jsom타입일 경우
	private Date hireDate;
	private Department department;	//단건조회
}
