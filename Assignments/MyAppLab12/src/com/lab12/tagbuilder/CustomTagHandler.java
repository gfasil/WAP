package com.lab12.tagbuilder;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTagHandler extends SimpleTagSupport{
	
	String color;
	String size;
	LocalDateTime dNow = LocalDateTime.now();
	public void setSize(String size) {
		this.size=size;
		
	}
	public void setColor(String color) {
		this.color=color;
		
	}
    public void doTag() throws JspException, IOException {
    	
    	JspWriter out = getJspContext().getOut();
    
    		if(color!=null && size!=null ) {
    			
    			out.write(String.format("<span style='color:%s; font-size:%s'>%s</span>", color, size,dNow.format(DateTimeFormatter.ofPattern("EE yyyy.MM.dd HH:mm:ss a"))));

    		}
    		else if(color==null && size!=null) {
    			
    			out.write(String.format("<span style='font-size:%s'>%s</span>", size,dNow.format(DateTimeFormatter.ofPattern("EE yyyy.MM.dd HH:mm:ss a"))));

    		}
else if(color!=null && size==null) {
    			
    			out.write(String.format("<span style='color:%s;'>%s</span>", color,dNow.format(DateTimeFormatter.ofPattern("EE yyyy.MM.dd HH:mm:ss a"))));

    		}
else {
    			
    			out.write(String.format("<span>%s</span>", dNow.format(DateTimeFormatter.ofPattern("EE yyyy.MM.dd HH:mm:ss a"))));

    		}
    }

}
