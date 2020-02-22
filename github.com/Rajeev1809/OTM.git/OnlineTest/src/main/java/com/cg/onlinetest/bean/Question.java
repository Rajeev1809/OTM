package com.cg.onlinetest.bean;

public class Question {
	
	// fields
	int questionId ; 
    String []questionOptions = new String[4];
	String questionTitle ;
	int questionAnswer ;
	float questionMarks ;
	int chosenAnswer ;
	float marksScored ;
	
	
	public Question(int questionId, String[] questionOptions, String questionTitle, int questionAnswer,
			float questionMarks, int chosenAnswer, float marksScored) {
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}
	
	
	public Question() {
		super();
	}


	// setters and getters
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public float getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(float questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public float getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(float marksScored) {
		this.marksScored = marksScored;
	}


}
