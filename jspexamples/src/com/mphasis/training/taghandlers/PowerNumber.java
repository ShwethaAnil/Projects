package com.mphasis.training.taghandlers;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PowerNumber extends TagSupport {
	private int power;
	private int number;
	private static int result=1;
	private static int counter;
	public void setPower(int power) {
		this.power = power;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int doStartTag()throws JspException{
		return EVAL_BODY_INCLUDE;
	}	
	public int doAfterBody() {
		counter++;
		result=result*number;
		if(counter==power)
			return SKIP_BODY;
		else
			return EVAL_BODY_AGAIN;
	}
	public int doEndTag()throws JspException{
		JspWriter out=pageContext.getOut();
		try {
			out.print(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}