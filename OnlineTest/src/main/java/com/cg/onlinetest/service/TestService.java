	package com.cg.onlinetest.service;



import com.cg.onlinetest.bean.Test;

import com.cg.onlinetest.exception.OnlineTestException;


public interface TestService {
	public boolean validateTestId(int testId);

	public Test  updateTest(int testId,Test test) throws OnlineTestException;
	public Test deleteTest(int testId)throws OnlineTestException;
	

}
