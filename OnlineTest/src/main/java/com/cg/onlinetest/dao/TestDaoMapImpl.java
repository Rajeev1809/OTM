package com.cg.onlinetest.dao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;


public class TestDaoMapImpl implements TestDao {
	
	
	
	
	private Map<Integer,Test> testmap;
	
	public int testing()
	{
		return 0;
	}
	public  TestDaoMapImpl()
	{
		testmap=new HashMap<Integer,Test>();
		
		Question q1 = new Question();
		Question q2 = new Question();
		Set<Question>  set1 = new HashSet<Question>();
		Set<Question>  set2 = new HashSet<Question>();
		set1.add(q1);
		set2.add(q2);
		
		Test  test1 = new Test(1001,"",LocalTime.now(),set1,100.0,0.0,q1,LocalDateTime.now(),LocalDateTime.now());
		Test  test2 = new Test(1002,"",LocalTime.now(),set2,100.0,0.0,q1,LocalDateTime.now(),LocalDateTime.now());
		testmap.put(1001, test1);
		testmap.put(1002, test2);
		
		
	}
	@Override
	public Test updateTest( int testId,Test test) throws OnlineTestException {
		boolean flag=testmap.containsKey(testId);
		
		if(flag)
		{
			
			test=testmap.replace(testId,test);
		}
		else
		{
			throw new OnlineTestException(testId+" id not found"); 
		}
		return test;
	
	
	}      
	@Override
	public Test deleteTest(int testId) throws OnlineTestException {
		boolean flag=testmap.containsKey(testId);
		Test test=null;
		if(flag)
		{
			test=testmap.remove(testId);
		}
		else
		{
			throw new OnlineTestException(testId+"id not found");
		}
		
		return test;
		
	}

	
	
}
 