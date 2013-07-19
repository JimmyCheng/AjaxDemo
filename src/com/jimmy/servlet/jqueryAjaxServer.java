package com.jimmy.servlet;

import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpServletRequest;  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
  
public class jqueryAjaxServer extends HttpServlet {  
     public jqueryAjaxServer(){  
         super();  
     }  
     public void doGet(HttpServletRequest request,HttpServletResponse response)  
     throws IOException ,ServletException {  
         response.setContentType("text/html;charset=utf-8");  
         PrintWriter out=response.getWriter();  
         String account=request.getParameter("account");  
         if("iamcrazy".equals(account)){  
             out.print("Sorry,the user already exists.");  
         }  
         else{  
        	 out.print("<html>");
        	 out.print("<head>");        	 
        	 out.print("<title>Hello Ajax, My first test!</title>");
        	 out.print("<body>");
             out.print("<h1>Congratulation,you can use account:" + account + "</h1>");
             out.print("</body>");
             out.print("</html>");
         }  
         out.close();  
     }  
     public void doPost(HttpServletRequest request,HttpServletResponse response)  
     throws IOException ,ServletException {  
         this.doGet(request, response);  
     }  
} 