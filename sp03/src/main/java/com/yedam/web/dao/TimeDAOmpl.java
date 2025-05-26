package com.yedam.web.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //@Conponent 스프링컨테이너 빈으로 등록
public class TimeDAOmpl  implements TimeDAO{
	
	@Autowired SqlSessionFactory sqlSessionFactory;
	
	@Override
	public String getTime() {
		return sqlSessionFactory.openSession().selectOne("com.yedam.web.mapper.TimeMapper.getTime2");
	}

}
