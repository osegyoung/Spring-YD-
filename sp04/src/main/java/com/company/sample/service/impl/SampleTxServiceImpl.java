package com.company.sample.service.impl;

import org.springframework.stereotype.Service;

import com.company.sample.mapper.Sample1Mapper;
import com.company.sample.mapper.Sample2Mapper;
import com.company.sample.service.SampleTxService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleTxServiceImpl implements SampleTxService{

	private final Sample1Mapper sample1Mapper;
	private final Sample2Mapper sample2Mapper;
	
	@Transactional
	@Override
	public void addData(String value) {
		sample1Mapper.insertCol1(value); //500
		sample2Mapper.insertCol2(value); //50
	}

}
