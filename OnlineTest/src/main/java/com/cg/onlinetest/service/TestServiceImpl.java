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
	public boolean validateTitle(String testTitle) {
		boolean flag =false;
		flag=testTitle.matches("[a-zA-Z]+");

		return flag;
		}

	@Override
	public boolean validateTestId(int testId) {
		String testid=String.valueOf(testId);
		boolean flag=false;
		 flag=testid.matches("[0-9]{4}+");
		return flag;
	}
	@Override
	public boolean validateTotalMarks(double testTotalMarks) {
		String testtotalmarks=String.valueOf(testTotalMarks);
		boolean flag=false;
		if(testTotalMarks>0&&testTotalMarks<100)
		{
			flag=true;
		 flag=testtotalmarks.matches("[0-9]{2}+");
		}
		return flag;
	}
@Override
	public Test updateTest( int testId,Test test) throws OnlineTestException {
	
	boolean a=false;
	a=validateTestId(testId); 
	if(a==false)
	{
	if(testId<0)
	{
		throw new OnlineTestException(" id should  be positive");
	}
		throw new OnlineTestException(" id should  contains 4 digits");
	}
	//String testTitle=String.valueOf(test.getTestTitle());
	
	boolean f=validateTitle(test.getTestTitle()); 
	if(f==false)
	{
		throw new OnlineTestException(" title should  contains valid charcters");
	}
	
	
	boolean b=validateTotalMarks(test.getTestTotalMarks()); 
	if(b==false)
	{
	if(test.getTestTotalMarks()<0)
	{
		throw new OnlineTestException(" marks should  be positive");
	}
		throw new OnlineTestException(" marks should be between 0 to 100");
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
