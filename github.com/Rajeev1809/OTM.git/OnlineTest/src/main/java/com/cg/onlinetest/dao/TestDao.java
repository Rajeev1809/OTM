package com.cg.onlinetest.dao;



import com.cg.onlinetest.bean.Test;

import com.cg.onlinetest.exception.OnlineTestException;


public interface TestDao {

	public Test  updateTest( int testId,Test test) throws OnlineTestException;
	public Test deleteTest(int testId)throws OnlineTestException;
	
}
