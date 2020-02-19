package com.cg.onlinetest.service;

import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.dao.TestDao;
import com.cg.onlinetest.dao.TestDaoMapImpl;
import com.cg.onlinetest.exception.OnlineTestException;


public class TestServiceImpl implements TestService {
	private TestDao testDao;
	public TestServiceImpl() {
		testDao=new  TestDaoMapImpl();
	}

	@Override
	public boolean validateTestId(int testId) {
		boolean flag=false;
		if(testId>=0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}

@Override
	public Test updateTest( int testId,Test test) throws OnlineTestException {
	String testid=String.valueOf(testId);
	boolean flag=testid.matches("[0-9]{4}");
	if(!flag)
	{
		throw new OnlineTestException(" id should  contains 4 digits");
	}
	return testDao.updateTest(testId,test);
	}

	@Override
	public Test deleteTest(int testId) throws OnlineTestException {
		String testid=String.valueOf(testId);
		boolean flag=testid.matches("[0-9]{4}");
		if(!flag)
		{
			throw new OnlineTestException(" id should  contains 4 digits");
		}
		return testDao.deleteTest(testId);
	}
	
}
