package com.mphasis.training.pojos;

public class Answer {  
private int id;  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String answer;  
 
public Answer() {}  
public Answer(int id, String answer) {  
    super();  
    this.id = id;  
    this.answer = answer;  
    
}  
  
public String toString(){  
    return "Id:"+id+" Answer:"+answer;  
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}  
}  