package com.cg.onlinetest.pl;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;
import com.cg.onlinetest.service.TestService;
import com.cg.onlinetest.service.TestServiceImpl;


public class TestClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//private Map<Integer,Test> testmap;
		Map<Integer,Test>testmap=new HashMap<Integer,Test>();
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
		
		TestService testservice=new TestServiceImpl();
		Test test=new Test();
		int choice=0;
		while(choice!=8)
		{
		   System.out.println("1.addTest");
		   System.out.println("2.updateTest");
		   System.out.println("3.deleteTest");
		   System.out.println("4.assignTest");
		   System.out.println("5.addQuestion");
		   System.out.println("6.updateQuestion");
		   System.out.println("7.deleteQuestion");
		   System.out.println("Enter the choice");
		    choice=sc.nextInt();  
		     int testId=0;
		    switch(choice)
		    {
		    case 1:
		    	
		    /*	try
		    	{
		    	 test=testservice.addTest(test);
		    	System.out.println("Test Id= "+testId);
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break;*/
		    
		    case 2:
		    	try
		    	{
		    		 System.out.println("Enter the testId");
		    		  testId=sc.nextInt();
		    		  test=testservice.updateTest(testId,test); 
		    		  sc.nextLine();
		    		  System.out.println("Enter the testTitle");
		    		 String testTitle=sc.nextLine();
		    		 
		    		  System.out.println("Enter the testDuration");
		    		LocalTime  testDuration=LocalTime.now();
		    		  sc.nextLine();
		    		  System.out.println("Enter the testTotalMarks");
		    		double  testTotalMarks=sc.nextDouble();
		    		  sc.nextLine();
		    		  System.out.println("Enter the testMarksScored");
			    		double  testMarksScored=sc.nextDouble();
			    		
			    	//	 System.out.println("Enter the StartTime");
				    		LocalDateTime  startTime=LocalDateTime.now();
				    		  
				    		// System.out.println("Enter the endTime");
					    		LocalDateTime  endTime=LocalDateTime.now();
					    		test.setTestId(testId);
					    		test.setTestTitle(testTitle);
					    		test.setTestDuration(testDuration);
					    		test.setTestTotalMarks(testTotalMarks);
					    		test.setTestMarksScored(testMarksScored);
					    		test.setStartTime(startTime);
					    		test.setEndTime(endTime);
		    		System.out.println("TestId "+testId);
		    		System.out.println("TestTitle "+testTitle);
		    		System.out.println("TestDuration "+testDuration);
		    		System.out.println("TestTotalMarks "+testTotalMarks);
		    		System.out.println("TestMarksScored "+testMarksScored);
		    		System.out.println("StartTime "+startTime);
		    		System.out.println("EndTime "+endTime);
		    		
		    		 
		    		 
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break;
		    	
		  case 3:
			   try
		    	{
		    		System.out.println("Enter the testId");
		    		testId=sc.nextInt();
		    		test=testservice.deleteTest(testId);
		    		System.out.println(testId+" is deleted");
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    case 4:
		    	/*try
		    	{
		    		System.out.println("Enter the userId");
		    		userId=sc.nextInt();
		    		userId=testservice.assignTest(test);
		    		System.out.println("Test is assigned to the given user "+userId);
		    		
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 5:
		    	/*try
		    	{
		    		System.out.println("Enter the testId in which you want to add question");
		    		testId=sc.nextInt();
		    		testId=testservice.addQuestion(question);
		    		System.out.println("QuestionId = "+question.getQuestionId());
		    		System.out.println("QuestionName = "+question.getQuestionTitle());
		    		System.out.println("QuestionOptions = "+question.getQuestionOptions());
		    		
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 6:
		    	/*	try
		    	{
		    		System.out.println("Enter the question id to update");
		    		questionId=sc.nextInt();
		    		System.out.println("Enter the answer to update");
		    		int answer=sc.nextInt();
		    		questionId=testservice.updateQuestionById(questionId);
		    		System.out.println(questionId+" is updated");
		    		
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 7:
		    	/*	try
		    	{
		    		System.out.println("Enter the question id to delete");
		    		questionId=sc.nextInt();
		    		questionId=testservice.deleteQuestion(question);
		    		System.out.println(questionId+" is deleted");
		    	}
		    	catch(OnlineTestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 8:
		    	
		    	System.out.println("exit");
		    	
		 
		    	 
		    }
		   
		}

	}

}
