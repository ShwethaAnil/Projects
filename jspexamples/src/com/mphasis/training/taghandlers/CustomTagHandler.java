package com.mphasis.training.taghandlers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagHandler extends TagSupport {
	public int doStartTag()throws JspException{
		JspWriter out=pageContext.getOut();
		try {
			out.print(new Date());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
