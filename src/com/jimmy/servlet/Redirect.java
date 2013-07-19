package com.jimmy.servlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpServletRequest;  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  

public class Redirect  extends HttpServlet {  
	  
	     public Redirect(){  
	         super();  
	     }  
	     public void doGet(HttpServletRequest request,HttpServletResponse response)  
	     throws IOException ,ServletException {
	    	 response.sendRedirect("http://news.163.com");	    	 	    	 
	     }  
	     
	     public void doPost(HttpServletRequest request,HttpServletResponse response)  
	     throws IOException ,ServletException {  
	         this.doGet(request, response);  
	     }  
	} 