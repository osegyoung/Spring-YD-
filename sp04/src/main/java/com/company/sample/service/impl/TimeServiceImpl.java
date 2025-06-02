package com.company.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.sample.mapper.TimeMapper;
import com.company.sample.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService{

	@Autowired TimeMapper timeMapper;
	
	@Override
	public String getTime() {
		return timeMapper.getTime();
	}

	@Override
	public String getTime2() {
		return timeMapper.getTime2();
	}

}
