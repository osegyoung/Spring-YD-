package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {

	List<Employees> findAll(SearchVO search); // 전체 조회
	List<Map<String,Object>> findAlltoMap(); // 경고 안뜨게 할려면
	List<Employees> getCount();
	int insert(Employees employees); // insert
	int updateFirstName(Employees employees); // update
	int delete(int employeeId);
	List<Employees> findEmployeeDepartment();
}
