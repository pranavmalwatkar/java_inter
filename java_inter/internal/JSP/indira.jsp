<%@ page language="java" import ="java.io.*" %>
<%! int a=0,b=o; %>
<% 
a=Integer.parseInt(request.getParameter("text1"));
if(a>b){
	out.println("Max number ="+a);
}else{
	out.println("Max number ="+b);
}
 %>