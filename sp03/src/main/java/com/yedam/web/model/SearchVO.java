package com.yedam.web.model;

import java.util.List;

import lombok.Data;
@Data
public class SearchVO extends Employees { // employees 상속받음
	
	int page;
	List<Integer> ids;
}
